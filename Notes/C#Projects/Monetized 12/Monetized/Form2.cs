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
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace Monetized
{
    public partial class frmSpawn : Form
    {
        public frmSpawn()
        {
            InitializeComponent();
        }

        public frmConstructionJob work = new frmConstructionJob();
        public frmTentCity home = new frmTentCity();
        public bool ConstructionJob;

        int usefulnum = 5;
        int money = Properties.Settings.Default.Money;

        private void pbPlayer_Click(object sender, EventArgs e)
        {
            tmrMove.Enabled = true;
            pbPlayer.Visible = false;
        }

        private void frmSpawnPoint_Load(object sender, EventArgs e)
        {
            pbDialog.Location = new Point(0 - pbDialog.Width, pbDialog.Location.Y);
            pbPlayer.Visible = true;
        }

        private void tmrMove_Tick(object sender, EventArgs e)
        {
            if(tmrMove.Enabled == true)
            {
                for (int i = 0; i < usefulnum; i++)
                {
                    pbDialog.Left += 4;
                }
            }
            if(pbDialog.Bounds.IntersectsWith(pnMoveWall.Bounds))
            {
                tmrMove.Enabled = false;
            }
        }

        private void btnLeft1_Click(object sender, EventArgs e)
        {
            this.Close();
            home.Show();
        }

        private void btnRight1_Click(object sender, EventArgs e)
        {
            if (ConstructionJob == true)
            {
                this.Close();
                work.Show();
            }
            else
            {
                MessageBox.Show("You are not clocked in! Clock in and come back to the site.");
            }
        }

        private void pbDialog_Click(object sender, EventArgs e)
        {
            pbParchment.Visible = true;
            btnExitParchment.Visible = true;
            btnExitParchment.Enabled = true;
            lblMoneyLabel.Visible = true;
            lblWork.Visible = true;
            lblStats.Visible = true;
            lblMoney.Visible = true;
            btnWorkStatus.Enabled = true;
            btnWorkStatus.Visible = true;
            money = Properties.Settings.Default.Money;
            lblMoney.Text = money.ToString();
        }

        private void pbParchment_Click(object sender, EventArgs e)
        {

        }

        private void btnExitParchment_Click(object sender, EventArgs e)
        {
            pbParchment.Visible = false;
            btnExitParchment.Visible = false;
            lblMoneyLabel.Visible = false;
            lblWork.Visible = false;
            btnExitParchment.Enabled = false;
            lblStats.Visible = false;
            lblMoney.Visible = false;
            btnWorkStatus.Visible = false;
            btnWorkStatus.Enabled = false;
        }

        private void btnWorkStatus_Click(object sender, EventArgs e)
        {
            ConstructionJob = true;
        }
    }
}
