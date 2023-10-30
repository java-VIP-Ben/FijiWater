namespace Monetized
{
    partial class frmConstructionJob
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmConstructionJob));
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.pictureBox4 = new System.Windows.Forms.PictureBox();
            this.btnBackToSpawn = new System.Windows.Forms.Button();
            this.btnWood = new System.Windows.Forms.Button();
            this.tmrConstruction = new System.Windows.Forms.Timer(this.components);
            this.label1 = new System.Windows.Forms.Label();
            this.lblWood = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.lblMoney = new System.Windows.Forms.Label();
            this.btnTool3 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox4)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox1.Image = global::Monetized.Properties.Resources.Construction_Worker;
            this.pictureBox1.Location = new System.Drawing.Point(1150, 295);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(65, 92);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox2.Image = global::Monetized.Properties.Resources.Construction_Worker;
            this.pictureBox2.Location = new System.Drawing.Point(906, 469);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(65, 92);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox2.TabIndex = 1;
            this.pictureBox2.TabStop = false;
            this.pictureBox2.Click += new System.EventHandler(this.pictureBox2_Click);
            // 
            // pictureBox3
            // 
            this.pictureBox3.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox3.Image = global::Monetized.Properties.Resources.Construction_Worker;
            this.pictureBox3.Location = new System.Drawing.Point(401, 429);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(65, 92);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox3.TabIndex = 2;
            this.pictureBox3.TabStop = false;
            this.pictureBox3.Click += new System.EventHandler(this.pictureBox3_Click);
            // 
            // pictureBox4
            // 
            this.pictureBox4.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox4.Image = global::Monetized.Properties.Resources.Construction_Worker;
            this.pictureBox4.Location = new System.Drawing.Point(996, 438);
            this.pictureBox4.Name = "pictureBox4";
            this.pictureBox4.Size = new System.Drawing.Size(556, 312);
            this.pictureBox4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox4.TabIndex = 3;
            this.pictureBox4.TabStop = false;
            this.pictureBox4.Click += new System.EventHandler(this.pictureBox4_Click);
            // 
            // btnBackToSpawn
            // 
            this.btnBackToSpawn.BackColor = System.Drawing.Color.Transparent;
            this.btnBackToSpawn.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnBackToSpawn.ForeColor = System.Drawing.Color.Transparent;
            this.btnBackToSpawn.Location = new System.Drawing.Point(-2, -64);
            this.btnBackToSpawn.Name = "btnBackToSpawn";
            this.btnBackToSpawn.Size = new System.Drawing.Size(75, 931);
            this.btnBackToSpawn.TabIndex = 4;
            this.btnBackToSpawn.UseVisualStyleBackColor = false;
            this.btnBackToSpawn.Click += new System.EventHandler(this.btnBackToSpawn_Click);
            // 
            // btnWood
            // 
            this.btnWood.BackColor = System.Drawing.Color.Transparent;
            this.btnWood.BackgroundImage = global::Monetized.Properties.Resources.PileOfLogs;
            this.btnWood.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.btnWood.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnWood.Location = new System.Drawing.Point(474, 625);
            this.btnWood.Name = "btnWood";
            this.btnWood.Size = new System.Drawing.Size(272, 138);
            this.btnWood.TabIndex = 5;
            this.btnWood.Text = " ";
            this.btnWood.UseVisualStyleBackColor = false;
            this.btnWood.Click += new System.EventHandler(this.btnWood_Click_1);
            // 
            // tmrConstruction
            // 
            this.tmrConstruction.Enabled = true;
            this.tmrConstruction.Interval = 10;
            this.tmrConstruction.Tick += new System.EventHandler(this.tmrConstruction_Tick_1);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.Black;
            this.label1.Location = new System.Drawing.Point(88, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(59, 20);
            this.label1.TabIndex = 6;
            this.label1.Text = "Wood: ";
            // 
            // lblWood
            // 
            this.lblWood.AutoSize = true;
            this.lblWood.BackColor = System.Drawing.Color.Transparent;
            this.lblWood.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblWood.ForeColor = System.Drawing.Color.Black;
            this.lblWood.Location = new System.Drawing.Point(153, 9);
            this.lblWood.Name = "lblWood";
            this.lblWood.Size = new System.Drawing.Size(18, 20);
            this.lblWood.TabIndex = 7;
            this.lblWood.Text = "0";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.Black;
            this.label2.Location = new System.Drawing.Point(88, 42);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(60, 20);
            this.label2.TabIndex = 8;
            this.label2.Text = "Money:";
            // 
            // lblMoney
            // 
            this.lblMoney.AutoSize = true;
            this.lblMoney.BackColor = System.Drawing.Color.Transparent;
            this.lblMoney.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMoney.ForeColor = System.Drawing.Color.Black;
            this.lblMoney.Location = new System.Drawing.Point(153, 42);
            this.lblMoney.Name = "lblMoney";
            this.lblMoney.Size = new System.Drawing.Size(18, 20);
            this.lblMoney.TabIndex = 9;
            this.lblMoney.Text = "0";
            // 
            // btnTool3
            // 
            this.btnTool3.BackColor = System.Drawing.Color.Transparent;
            this.btnTool3.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.btnTool3.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnTool3.Location = new System.Drawing.Point(727, 469);
            this.btnTool3.Name = "btnTool3";
            this.btnTool3.Size = new System.Drawing.Size(163, 138);
            this.btnTool3.TabIndex = 10;
            this.btnTool3.Text = " ";
            this.btnTool3.UseVisualStyleBackColor = false;
            this.btnTool3.Click += new System.EventHandler(this.button1_Click);
            // 
            // frmConstructionJob
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::Monetized.Properties.Resources.ConstructionSite;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1584, 861);
            this.Controls.Add(this.btnTool3);
            this.Controls.Add(this.lblMoney);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btnWood);
            this.Controls.Add(this.lblWood);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnBackToSpawn);
            this.Controls.Add(this.pictureBox4);
            this.Controls.Add(this.pictureBox3);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.DoubleBuffered = true;
            this.ForeColor = System.Drawing.Color.Transparent;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "frmConstructionJob";
            this.Text = " ";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.frmConstructionJob_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox4)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.PictureBox pictureBox4;
        private System.Windows.Forms.Button btnBackToSpawn;
        private System.Windows.Forms.Button btnWood;
        private System.Windows.Forms.Timer tmrConstruction;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblWood;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblMoney;
        private System.Windows.Forms.Button btnTool3;
    }
}