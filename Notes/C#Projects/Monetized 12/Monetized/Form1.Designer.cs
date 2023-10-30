namespace Monetized
{
    partial class frmLoading
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmLoading));
            this.button1 = new System.Windows.Forms.Button();
            this.btnSettings = new System.Windows.Forms.Button();
            this.btnClose = new System.Windows.Forms.Button();
            this.mnuSettings = new System.Windows.Forms.MenuStrip();
            this.settingsToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.musicToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.howToPlayToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.movementToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.strategiesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.debugToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.resetWoodToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.resetAllProgressToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.mnuSettings.SuspendLayout();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.Transparent;
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.button1.ForeColor = System.Drawing.Color.Transparent;
            this.button1.Location = new System.Drawing.Point(1333, 745);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(252, 88);
            this.button1.TabIndex = 0;
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnSettings
            // 
            this.btnSettings.BackColor = System.Drawing.Color.Transparent;
            this.btnSettings.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnSettings.ForeColor = System.Drawing.Color.CornflowerBlue;
            this.btnSettings.Location = new System.Drawing.Point(1276, 13);
            this.btnSettings.Name = "btnSettings";
            this.btnSettings.Size = new System.Drawing.Size(145, 130);
            this.btnSettings.TabIndex = 1;
            this.btnSettings.UseVisualStyleBackColor = false;
            this.btnSettings.Click += new System.EventHandler(this.btnSettings_Click);
            // 
            // btnClose
            // 
            this.btnClose.BackColor = System.Drawing.Color.Transparent;
            this.btnClose.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnClose.Location = new System.Drawing.Point(1440, 12);
            this.btnClose.Name = "btnClose";
            this.btnClose.Size = new System.Drawing.Size(132, 130);
            this.btnClose.TabIndex = 2;
            this.btnClose.UseVisualStyleBackColor = false;
            this.btnClose.Click += new System.EventHandler(this.btnClose_Click);
            // 
            // mnuSettings
            // 
            this.mnuSettings.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.settingsToolStripMenuItem});
            this.mnuSettings.Location = new System.Drawing.Point(0, 0);
            this.mnuSettings.Name = "mnuSettings";
            this.mnuSettings.Size = new System.Drawing.Size(1584, 24);
            this.mnuSettings.TabIndex = 3;
            this.mnuSettings.Text = "Settings";
            this.mnuSettings.Visible = false;
            this.mnuSettings.ItemClicked += new System.Windows.Forms.ToolStripItemClickedEventHandler(this.mnuSettings_ItemClicked);
            // 
            // settingsToolStripMenuItem
            // 
            this.settingsToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.musicToolStripMenuItem,
            this.howToPlayToolStripMenuItem,
            this.debugToolStripMenuItem});
            this.settingsToolStripMenuItem.Name = "settingsToolStripMenuItem";
            this.settingsToolStripMenuItem.Size = new System.Drawing.Size(61, 20);
            this.settingsToolStripMenuItem.Text = "Settings";
            // 
            // musicToolStripMenuItem
            // 
            this.musicToolStripMenuItem.Name = "musicToolStripMenuItem";
            this.musicToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.musicToolStripMenuItem.Text = "Music";
            // 
            // howToPlayToolStripMenuItem
            // 
            this.howToPlayToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.movementToolStripMenuItem,
            this.strategiesToolStripMenuItem});
            this.howToPlayToolStripMenuItem.Name = "howToPlayToolStripMenuItem";
            this.howToPlayToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.howToPlayToolStripMenuItem.Text = "How to Play";
            // 
            // movementToolStripMenuItem
            // 
            this.movementToolStripMenuItem.Name = "movementToolStripMenuItem";
            this.movementToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.movementToolStripMenuItem.Text = "movement";
            this.movementToolStripMenuItem.Click += new System.EventHandler(this.movementToolStripMenuItem_Click);
            // 
            // strategiesToolStripMenuItem
            // 
            this.strategiesToolStripMenuItem.Name = "strategiesToolStripMenuItem";
            this.strategiesToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.strategiesToolStripMenuItem.Text = "strategies";
            this.strategiesToolStripMenuItem.Click += new System.EventHandler(this.strategiesToolStripMenuItem_Click);
            // 
            // debugToolStripMenuItem
            // 
            this.debugToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.resetWoodToolStripMenuItem,
            this.resetAllProgressToolStripMenuItem});
            this.debugToolStripMenuItem.Name = "debugToolStripMenuItem";
            this.debugToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.debugToolStripMenuItem.Text = "Debug";
            // 
            // resetWoodToolStripMenuItem
            // 
            this.resetWoodToolStripMenuItem.Name = "resetWoodToolStripMenuItem";
            this.resetWoodToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.resetWoodToolStripMenuItem.Text = "Reset Wood";
            this.resetWoodToolStripMenuItem.Click += new System.EventHandler(this.resetWoodToolStripMenuItem_Click);
            // 
            // resetAllProgressToolStripMenuItem
            // 
            this.resetAllProgressToolStripMenuItem.Name = "resetAllProgressToolStripMenuItem";
            this.resetAllProgressToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.resetAllProgressToolStripMenuItem.Text = "Reset All Progress";
            this.resetAllProgressToolStripMenuItem.Click += new System.EventHandler(this.resetAllProgressToolStripMenuItem_Click);
            // 
            // frmLoading
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this.ClientSize = new System.Drawing.Size(1584, 861);
            this.Controls.Add(this.btnClose);
            this.Controls.Add(this.btnSettings);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.mnuSettings);
            this.Cursor = System.Windows.Forms.Cursors.Hand;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.mnuSettings;
            this.Name = "frmLoading";
            this.Text = "Monetized Loading";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.frmLoading_Load);
            this.mnuSettings.ResumeLayout(false);
            this.mnuSettings.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button btnSettings;
        private System.Windows.Forms.Button btnClose;
        private System.Windows.Forms.MenuStrip mnuSettings;
        private System.Windows.Forms.ToolStripMenuItem settingsToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem musicToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem howToPlayToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem movementToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem strategiesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem debugToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem resetWoodToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem resetAllProgressToolStripMenuItem;
    }
}

