namespace Monetized
{
    partial class frmSpawn
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmSpawn));
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pbPlayer = new System.Windows.Forms.PictureBox();
            this.btnRight1 = new System.Windows.Forms.Button();
            this.btnLeft1 = new System.Windows.Forms.Button();
            this.pbDialog = new System.Windows.Forms.PictureBox();
            this.tmrMove = new System.Windows.Forms.Timer(this.components);
            this.pnMoveWall = new System.Windows.Forms.Panel();
            this.pbParchment = new System.Windows.Forms.PictureBox();
            this.lblStats = new System.Windows.Forms.Label();
            this.btnExitParchment = new System.Windows.Forms.Button();
            this.lblMoneyLabel = new System.Windows.Forms.Label();
            this.lblWork = new System.Windows.Forms.Label();
            this.lblMoney = new System.Windows.Forms.Label();
            this.btnWorkStatus = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbPlayer)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbDialog)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbParchment)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.Location = new System.Drawing.Point(0, 0);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(100, 50);
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // pbPlayer
            // 
            this.pbPlayer.BackColor = System.Drawing.Color.Transparent;
            this.pbPlayer.Image = ((System.Drawing.Image)(resources.GetObject("pbPlayer.Image")));
            this.pbPlayer.Location = new System.Drawing.Point(1203, 506);
            this.pbPlayer.Name = "pbPlayer";
            this.pbPlayer.Size = new System.Drawing.Size(207, 152);
            this.pbPlayer.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbPlayer.TabIndex = 1;
            this.pbPlayer.TabStop = false;
            this.pbPlayer.Click += new System.EventHandler(this.pbPlayer_Click);
            // 
            // btnRight1
            // 
            this.btnRight1.BackColor = System.Drawing.Color.Transparent;
            this.btnRight1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnRight1.Location = new System.Drawing.Point(1504, -1);
            this.btnRight1.Name = "btnRight1";
            this.btnRight1.Size = new System.Drawing.Size(102, 863);
            this.btnRight1.TabIndex = 2;
            this.btnRight1.UseVisualStyleBackColor = false;
            this.btnRight1.Click += new System.EventHandler(this.btnRight1_Click);
            // 
            // btnLeft1
            // 
            this.btnLeft1.BackColor = System.Drawing.Color.Transparent;
            this.btnLeft1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnLeft1.Location = new System.Drawing.Point(0, 0);
            this.btnLeft1.Name = "btnLeft1";
            this.btnLeft1.Size = new System.Drawing.Size(102, 863);
            this.btnLeft1.TabIndex = 3;
            this.btnLeft1.UseVisualStyleBackColor = false;
            this.btnLeft1.Click += new System.EventHandler(this.btnLeft1_Click);
            // 
            // pbDialog
            // 
            this.pbDialog.BackColor = System.Drawing.Color.Transparent;
            this.pbDialog.Image = global::Monetized.Properties.Resources.HomelessCardboardEdit1;
            this.pbDialog.Location = new System.Drawing.Point(150, 383);
            this.pbDialog.Name = "pbDialog";
            this.pbDialog.Size = new System.Drawing.Size(490, 441);
            this.pbDialog.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pbDialog.TabIndex = 4;
            this.pbDialog.TabStop = false;
            this.pbDialog.Click += new System.EventHandler(this.pbDialog_Click);
            // 
            // tmrMove
            // 
            this.tmrMove.Interval = 10;
            this.tmrMove.Tick += new System.EventHandler(this.tmrMove_Tick);
            // 
            // pnMoveWall
            // 
            this.pnMoveWall.BackColor = System.Drawing.Color.Transparent;
            this.pnMoveWall.Location = new System.Drawing.Point(646, -22);
            this.pnMoveWall.Name = "pnMoveWall";
            this.pnMoveWall.Size = new System.Drawing.Size(11, 885);
            this.pnMoveWall.TabIndex = 5;
            // 
            // pbParchment
            // 
            this.pbParchment.BackColor = System.Drawing.Color.Transparent;
            this.pbParchment.Image = ((System.Drawing.Image)(resources.GetObject("pbParchment.Image")));
            this.pbParchment.Location = new System.Drawing.Point(683, 316);
            this.pbParchment.Name = "pbParchment";
            this.pbParchment.Size = new System.Drawing.Size(460, 342);
            this.pbParchment.SizeMode = System.Windows.Forms.PictureBoxSizeMode.CenterImage;
            this.pbParchment.TabIndex = 6;
            this.pbParchment.TabStop = false;
            this.pbParchment.Visible = false;
            this.pbParchment.Click += new System.EventHandler(this.pbParchment_Click);
            // 
            // lblStats
            // 
            this.lblStats.AutoSize = true;
            this.lblStats.BackColor = System.Drawing.Color.BurlyWood;
            this.lblStats.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblStats.Location = new System.Drawing.Point(696, 325);
            this.lblStats.Name = "lblStats";
            this.lblStats.Size = new System.Drawing.Size(85, 24);
            this.lblStats.TabIndex = 7;
            this.lblStats.Text = "Statistics:";
            this.lblStats.Visible = false;
            // 
            // btnExitParchment
            // 
            this.btnExitParchment.BackColor = System.Drawing.Color.LightCoral;
            this.btnExitParchment.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnExitParchment.Location = new System.Drawing.Point(1090, 325);
            this.btnExitParchment.Name = "btnExitParchment";
            this.btnExitParchment.Size = new System.Drawing.Size(41, 26);
            this.btnExitParchment.TabIndex = 8;
            this.btnExitParchment.Text = "EXIT";
            this.btnExitParchment.UseVisualStyleBackColor = false;
            this.btnExitParchment.Visible = false;
            this.btnExitParchment.Click += new System.EventHandler(this.btnExitParchment_Click);
            // 
            // lblMoneyLabel
            // 
            this.lblMoneyLabel.AutoSize = true;
            this.lblMoneyLabel.BackColor = System.Drawing.Color.BurlyWood;
            this.lblMoneyLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMoneyLabel.Location = new System.Drawing.Point(696, 362);
            this.lblMoneyLabel.Name = "lblMoneyLabel";
            this.lblMoneyLabel.Size = new System.Drawing.Size(73, 24);
            this.lblMoneyLabel.TabIndex = 9;
            this.lblMoneyLabel.Text = "Money:";
            this.lblMoneyLabel.Visible = false;
            // 
            // lblWork
            // 
            this.lblWork.AutoSize = true;
            this.lblWork.BackColor = System.Drawing.Color.BurlyWood;
            this.lblWork.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblWork.Location = new System.Drawing.Point(699, 399);
            this.lblWork.Name = "lblWork";
            this.lblWork.Size = new System.Drawing.Size(59, 24);
            this.lblWork.TabIndex = 10;
            this.lblWork.Text = "Work:";
            this.lblWork.Visible = false;
            // 
            // lblMoney
            // 
            this.lblMoney.AutoSize = true;
            this.lblMoney.BackColor = System.Drawing.Color.BurlyWood;
            this.lblMoney.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMoney.Location = new System.Drawing.Point(775, 362);
            this.lblMoney.Name = "lblMoney";
            this.lblMoney.Size = new System.Drawing.Size(20, 24);
            this.lblMoney.TabIndex = 11;
            this.lblMoney.Text = "0";
            this.lblMoney.Visible = false;
            // 
            // btnWorkStatus
            // 
            this.btnWorkStatus.Location = new System.Drawing.Point(765, 399);
            this.btnWorkStatus.Name = "btnWorkStatus";
            this.btnWorkStatus.Size = new System.Drawing.Size(75, 23);
            this.btnWorkStatus.TabIndex = 12;
            this.btnWorkStatus.Text = "Clock In";
            this.btnWorkStatus.UseVisualStyleBackColor = true;
            this.btnWorkStatus.Visible = false;
            this.btnWorkStatus.Click += new System.EventHandler(this.btnWorkStatus_Click);
            // 
            // frmSpawn
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Chartreuse;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1584, 861);
            this.Controls.Add(this.btnWorkStatus);
            this.Controls.Add(this.lblMoney);
            this.Controls.Add(this.lblWork);
            this.Controls.Add(this.lblMoneyLabel);
            this.Controls.Add(this.btnExitParchment);
            this.Controls.Add(this.lblStats);
            this.Controls.Add(this.pnMoveWall);
            this.Controls.Add(this.pbDialog);
            this.Controls.Add(this.btnLeft1);
            this.Controls.Add(this.btnRight1);
            this.Controls.Add(this.pbPlayer);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.pbParchment);
            this.Cursor = System.Windows.Forms.Cursors.Hand;
            this.DoubleBuffered = true;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.KeyPreview = true;
            this.Name = "frmSpawn";
            this.Text = "SpawnPoint";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.frmSpawnPoint_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbPlayer)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbDialog)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbParchment)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pbPlayer;
        private System.Windows.Forms.Button btnRight1;
        private System.Windows.Forms.Button btnLeft1;
        private System.Windows.Forms.PictureBox pbDialog;
        private System.Windows.Forms.Timer tmrMove;
        private System.Windows.Forms.Panel pnMoveWall;
        private System.Windows.Forms.PictureBox pbParchment;
        private System.Windows.Forms.Label lblStats;
        private System.Windows.Forms.Button btnExitParchment;
        private System.Windows.Forms.Label lblMoneyLabel;
        private System.Windows.Forms.Label lblWork;
        private System.Windows.Forms.Label lblMoney;
        private System.Windows.Forms.Button btnWorkStatus;
    }
}