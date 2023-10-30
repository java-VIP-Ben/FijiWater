using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Monetized
{
    public partial class frmTentCity : Form
    {
        public frmTentCity()
        {
            InitializeComponent();
        }

        bool tent = Properties.Settings.Default.tent;
        Random gen = new Random(); //generating new random numbers
        int n = 0;
        private void btnHome_Click(object sender, EventArgs e)
        {
            if (Properties.Settings.Default.tent == false)
            {
                DialogResult dialogResult = MessageBox.Show("New homeowner? This tent is 100 dollars.", "Home Sweet Home", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    if (Properties.Settings.Default.Money >= 100)
                    {
                        Properties.Settings.Default.Money -= 100;
                        Properties.Settings.Default.Money = Properties.Settings.Default.Money * 2;
                        Properties.Settings.Default.tent = true;
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

                if(Properties.Settings.Default.tent == true)
                {
                    MessageBox.Show("You feel well rested after getting some food and water.");
                }
            }
        }

        private void btnPropane_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Some people are paying you to literally commit arson, but if you get caught, there is a 300 dollar fine. Yes for Arson, no to cancel.", "Whatcha gonna do with this?", MessageBoxButtons.YesNo);
            if (Properties.Settings.Default.Money >= 300)
            {
                if (dialogResult == DialogResult.Yes)
                {
                    n = gen.Next(0, 5);
                    if (n == 1 || n == 2 || n == 3)
                    {
                        MessageBox.Show("Hmm, you got away with it, this time. Heres 100 dollars for your trouble.");
                        Properties.Settings.Default.Money += 100;
                        lblMoney.Text = Properties.Settings.Default.Money.ToString();
                        Properties.Settings.Default.Save();
                    }
                    if (n == 4 || n == 5)
                    {
                        MessageBox.Show("You got caught by the police before you could set a fire, they fine you 300 dollars for your actions!");
                        Properties.Settings.Default.Money -= 300;
                        lblMoney.Text = Properties.Settings.Default.Money.ToString();
                        Properties.Settings.Default.Save();
                    }
                }
            }
            else
            {
                //cancelling
            }         
        }

        private void btnHomeRight_Click(object sender, EventArgs e)
        {
            Hide();
            frmSpawn Spawn = new frmSpawn();
            Spawn.ShowDialog();
        }

        private void frmTentCity_Load(object sender, EventArgs e)
        {
            tent = Properties.Settings.Default.tent;
            Properties.Settings.Default.Money = Properties.Settings.Default.Money;
            lblMoney.Text = Properties.Settings.Default.Money.ToString(); ;
        }

    }
}
