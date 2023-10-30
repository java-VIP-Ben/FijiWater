using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace Monetized
{
    public partial class frmConstructionJob : Form
    {
        public frmConstructionJob()
        {
            InitializeComponent();
        }

        bool tool1 = Properties.Settings.Default.tool1;
        bool tool2 = Properties.Settings.Default.tool2;
        bool tool3 = Properties.Settings.Default.tool3;
        int tool1W = 2;
        int tool2W = 5;
        int tool3W = 20;

        private void frmConstructionJob_Load(object sender, EventArgs e)
        {
            
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("I work the escavator, dont bother me!");
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Click on the wood bars to work, at the end of the day you will recieve your paycheck.");
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Buy tools to make your work more efficient! Now leave me alone, im standing on this truck.");
            DialogResult dialogResult = MessageBox.Show("If you get this overpriced jackhammer for 250 dollars, you will probably make more money or something!", "Tool Shop", MessageBoxButtons.YesNo);
            if (dialogResult == DialogResult.Yes)
            {
                if (Properties.Settings.Default.Money >= 250)
                {
                    Properties.Settings.Default.Money -= 250;
                    tool1 = false;
                    tool2 = true;
                    Properties.Settings.Default.Save();
                }
                else
                {

                }
            }
            else if (dialogResult == DialogResult.No)
            {
                //do something else
            }
        }

        private void btnBackToSpawn_Click(object sender, EventArgs e)
        {
            Hide();
            frmSpawn Spawn = new frmSpawn();
            Spawn.ShowDialog();
        }

        #region junk
        private void btnWood_Click(object sender, EventArgs e)
        {
            
        }
        private void tmrConstruction_Tick(object sender, EventArgs e)
        {   
            
        }
# endregion

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Now that you've been hired, you will need to work to get any money. Click on the pile of wood to earn money. At the end of the day you will recieve your paycheck");
            DialogResult dialogResult = MessageBox.Show("Would you like to buy a shovel for $45?", "Your boss, dont mess this up.", MessageBoxButtons.YesNo);
            if (dialogResult == DialogResult.Yes)
            {
                if(Properties.Settings.Default.Money >= 45)
                {
                    Properties.Settings.Default.Money -= 45;
                    tool1 = true;
                    Properties.Settings.Default.Save();
                }
                else
                {

                }
            }
            else if (dialogResult == DialogResult.No)
            {
                //do something else
            }
        }

        private void btnWood_Click_1(object sender, EventArgs e)
        {
            Properties.Settings.Default.Wood += 1;

            if(tool1 == true)
            {
                Properties.Settings.Default.Wood += tool1W;
            }

            if(tool2 == true)
            {
                tool1 = false;
                Properties.Settings.Default.Wood += tool2W;
            }
            if(tool3 == true)
            {
                tool1 = false;
                tool2 = false;
                Properties.Settings.Default.Wood += tool3W;
            }

            if (Properties.Settings.Default.Wood >= 50)
            {
                Properties.Settings.Default.Money += 20;
                Properties.Settings.Default.Wood = 0;
            }
        }

        private void tmrConstruction_Tick_1(object sender, EventArgs e)
        {
                lblWood.Text = Properties.Settings.Default.Wood.ToString();
                lblMoney.Text = Properties.Settings.Default.Money.ToString();
           
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (Properties.Settings.Default.Wood >= 50)
            {
                Properties.Settings.Default.Money += 20;
            }

            if (tool3 == false)
            {
                DialogResult dialogResult = MessageBox.Show("Would you like to rent the excavator? Its 1000 dollars, but you get to use it anytime.", "Dont break it...", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    if (Properties.Settings.Default.Money >= 1000)
                    {
                        Properties.Settings.Default.Money -= 1000;
                        tool3 = true;
                        tool1 = false;
                        tool2 = false;
                        Properties.Settings.Default.Save();
                    }
                    else
                    {

                    }
                }
                else if (dialogResult == DialogResult.No)
                {
                    //do something else
                }
            }
            if(tool3 == true)
            {
                MessageBox.Show("You already have this, best of luck getting all that wood!");
            }

            Properties.Settings.Default.Save();
        }
    }
}
