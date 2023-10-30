namespace Monetized
{
    partial class frmTentCity
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmTentCity));
            this.btnHome = new System.Windows.Forms.Button();
            this.btnPropane = new System.Windows.Forms.Button();
            this.btnHomeRight = new System.Windows.Forms.Button();
            this.btnHomeLeft = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.lblMoney = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnHome
            // 
            this.btnHome.BackColor = System.Drawing.Color.Transparent;
            this.btnHome.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnHome.Location = new System.Drawing.Point(83, 256);
            this.btnHome.Name = "btnHome";
            this.btnHome.Size = new System.Drawing.Size(618, 249);
            this.btnHome.TabIndex = 0;
            this.btnHome.Text = " ";
            this.btnHome.UseVisualStyleBackColor = false;
            this.btnHome.Click += new System.EventHandler(this.btnHome_Click);
            // 
            // btnPropane
            // 
            this.btnPropane.BackColor = System.Drawing.Color.Transparent;
            this.btnPropane.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnPropane.Location = new System.Drawing.Point(219, 553);
            this.btnPropane.Name = "btnPropane";
            this.btnPropane.Size = new System.Drawing.Size(177, 171);
            this.btnPropane.TabIndex = 1;
            this.btnPropane.Text = " ";
            this.btnPropane.UseVisualStyleBackColor = false;
            this.btnPropane.Click += new System.EventHandler(this.btnPropane_Click);
            // 
            // btnHomeRight
            // 
            this.btnHomeRight.BackColor = System.Drawing.Color.Transparent;
            this.btnHomeRight.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnHomeRight.Location = new System.Drawing.Point(1508, -52);
            this.btnHomeRight.Name = "btnHomeRight";
            this.btnHomeRight.Size = new System.Drawing.Size(128, 928);
            this.btnHomeRight.TabIndex = 2;
            this.btnHomeRight.Text = " ";
            this.btnHomeRight.UseVisualStyleBackColor = false;
            this.btnHomeRight.Click += new System.EventHandler(this.btnHomeRight_Click);
            // 
            // btnHomeLeft
            // 
            this.btnHomeLeft.BackColor = System.Drawing.Color.Transparent;
            this.btnHomeLeft.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnHomeLeft.Location = new System.Drawing.Point(-19, -19);
            this.btnHomeLeft.Name = "btnHomeLeft";
            this.btnHomeLeft.Size = new System.Drawing.Size(96, 928);
            this.btnHomeLeft.TabIndex = 3;
            this.btnHomeLeft.Text = " ";
            this.btnHomeLeft.UseVisualStyleBackColor = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.Black;
            this.label2.Location = new System.Drawing.Point(83, 9);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(60, 20);
            this.label2.TabIndex = 9;
            this.label2.Text = "Money:";
            // 
            // lblMoney
            // 
            this.lblMoney.AutoSize = true;
            this.lblMoney.BackColor = System.Drawing.Color.Transparent;
            this.lblMoney.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMoney.ForeColor = System.Drawing.Color.Black;
            this.lblMoney.Location = new System.Drawing.Point(147, 10);
            this.lblMoney.Name = "lblMoney";
            this.lblMoney.Size = new System.Drawing.Size(18, 20);
            this.lblMoney.TabIndex = 10;
            this.lblMoney.Text = "0";
            // 
            // frmTentCity
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::Monetized.Properties.Resources.TentCity;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1584, 861);
            this.Controls.Add(this.lblMoney);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btnHomeLeft);
            this.Controls.Add(this.btnHomeRight);
            this.Controls.Add(this.btnPropane);
            this.Controls.Add(this.btnHome);
            this.DoubleBuffered = true;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "frmTentCity";
            this.Text = "City-Of-Homeless";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.frmTentCity_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnHome;
        private System.Windows.Forms.Button btnPropane;
        private System.Windows.Forms.Button btnHomeRight;
        private System.Windows.Forms.Button btnHomeLeft;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblMoney;
    }
}