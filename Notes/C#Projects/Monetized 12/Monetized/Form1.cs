using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Monetized
{

    //USE SONG: FREE BIRD   LENARD SKINERD FROM THE ALBUM ITS PRONOUNCE
    public partial class frmLoading : Form
    {
        public frmLoading()
        {
            InitializeComponent();
        }

       public frmSpawn Spawn = new frmSpawn();

        private void frmLoading_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            Spawn.Show();
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnSettings_Click(object sender, EventArgs e)
        {
            if (mnuSettings.Visible == false)
            {
                mnuSettings.Visible = true;
            }
            else
            {
                mnuSettings.Visible = false;
            }
        }

        private void mnuSettings_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {

        }

        private void resetWoodToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Properties.Settings.Default.Wood = 0;
            Properties.Settings.Default.Save();
        }

        private void resetAllProgressToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Properties.Settings.Default.Wood = 0;
            Properties.Settings.Default.tool1 = false;
            Properties.Settings.Default.tool2 = false;
            Properties.Settings.Default.tool3 = false;
            Properties.Settings.Default.tent = false;
            Properties.Settings.Default.Money = 300;
            Properties.Settings.Default.Save();

        }

        private void movementToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Click the buttons on the sides of your screen to navigate through different locations. From there you can try to make money.");
        }

        private void strategiesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("In order to make more money, you should hold the enter key down after clicking the wood pile, it makes money far faster than clicking individually.");
            MessageBox.Show("The arson feature, the propane barrels, is a useful tool to make a quick hundred dollars, but dont hold down enter or you will end up losing more money than you gain.");

        }
    }
}
