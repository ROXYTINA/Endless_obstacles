# GitHub Pages Setup - Display Game on Web

Setup your GitHub project to display your game on the web for portfolio visibility.

---

## 📖 What is GitHub Pages?

GitHub Pages allows you to host a **free website** directly from your GitHub repository. Perfect for:
- ✅ Game portfolio
- ✅ Project showcase
- ✅ Profile link hub
- ✅ Documentation

No cost, no hosting fees, includes free HTTPS!

---

## ✅ Quick Setup (5 minutes)

### Step 1: Move HTML to Repository Root

You need to commit `index.html` to your GitHub repo. There are two options:

**Option A: Add the provided portfolio page**

1. Copy this file to your repo root:
   ```
   Endless_Obstacles/
   ├── index.html              ← HERE
   ├── README.md
   ├── platform2D/
   ├── .git/
   └── ...
   ```

2. Use the `index.html` provided in this folder (or create your own)

**Option B: Use existing README as index**

If you prefer, rename your README to a different name and use it as the homepage.

---

### Step 2: Enable GitHub Pages

1. Go to your repository: https://github.com/ROXYTINA/Endless_obstacles

2. Click **Settings** (gear icon, top right)

3. In left sidebar, click **Pages** (under "Code and automation")

4. Under "Source", select:
   - Branch: `main`
   - Folder: `/ (root)`

5. Click **Save**

GitHub will show a message:
```
Your site is ready to be published at https://roxytina.github.io/endless-obstacles/
```

That's your site URL! ✅

---

### Step 3: Commit & Push Files

### If using VS Code or Git CLI:

```bash
# Navigate to your repo
cd D:\My\ project\Endless\ Obstacle

# If not already a git repo, initialize it
git init

# Add files
git add index.html
git add README.md
git add -A

# Commit
git commit -m "Add portfolio page and GitHub Pages setup"

# Push to GitHub
git push -u origin main
```

### If using GitHub Desktop:

1. Open GitHub Desktop
2. Select "Endless_obstacles" repository
3. Add your files to the repo folder
4. Click "Commit to main"
5. Click "Push origin"

---

## 🌐 Your Portfolio URL

After Pages is enabled and files are pushed, visit:

```
https://roxytina.github.io/endless-obstacles/
```

Your portfolio is **live** on the web! 🎉

---

## 📁 Recommended Repository Structure

```
Endless_obstacles/
│
├── index.html                 ← Portfolio homepage
├── README.md                  ← Project description
│
├── downloads/
│   ├── EndlessObstacle-windows.zip
│   └── EndlessObstacle.jar
│
├── assets/
│   ├── screenshot1.png
│   ├── screenshot2.png
│   ├── gameplay.gif
│   └── logo.png
│
├── docs/
│   ├── FEATURES.md
│   ├── GAMEPLAY.md
│   └── DEVELOPMENT.md
│
└── platform2D/                ← Your source code
    ├── src/
    ├── bin/
    ├── README.md
    └── ...
```

---

## 🎨 Customize Your Portfolio Page

Edit `index.html` to:
- Change colors (CSS section at top)
- Update game description
- Add your social links
- Add screenshots/GIFs
- Customize features list

Example customizations:

### Add Your Photo/Avatar

```html
<div style="text-align: center; margin: 20px 0;">
    <img src="assets/your-photo.jpg" 
         alt="Your Name" 
         style="width: 150px; height: 150px; border-radius: 50%; border: 4px solid #667eea;">
</div>
```

### Link to Your Other Games

```html
<div class="buttons">
    <a href="https://itch.io/user/YOURUSERNAME" target="_blank" class="button button-secondary">
        👾 More Games on itch.io
    </a>
</div>
```

### Add Social Links

```html
<footer>
    <p>
        <a href="https://github.com/ROXYTINA" target="_blank">GitHub</a> •
        <a href="https://twitter.com/yourname" target="_blank">Twitter</a> •
        <a href="https://linkedin.com/in/yourname" target="_blank">LinkedIn</a>
    </p>
</footer>
```

---

## 📦 Add Download Links

Make your game easy to download from the portfolio:

### Create a Downloads Page

Create `downloads.html`:

```html
<!DOCTYPE html>
<html>
<head>
    <title>Endless Obstacle - Downloads</title>
    <style>
        body { font-family: Arial; margin: 40px; }
        .download-box { 
            background: #f0f0f0; 
            padding: 20px; 
            border-radius: 8px; 
            margin: 20px 0;
        }
    </style>
</head>
<body>
    <h1>📥 Download Endless Obstacle</h1>
    
    <div class="download-box">
        <h2>🪟 Windows Executable (Recommended)</h2>
        <p>Extract and run EndlessObstacle.exe - includes Java runtime!</p>
        <a href="https://github.com/ROXYTINA/Endless_obstacles/releases/download/v1.0/EndlessObstacle-windows.zip">
            ⬇️ Download ZIP (40 MB)
        </a>
    </div>

    <div class="download-box">
        <h2>☕ Java JAR (Requires Java 21)</h2>
        <p>Run with: java -jar EndlessObstacle.jar</p>
        <a href="https://github.com/ROXYTINA/Endless_obstacles/releases/download/v1.0/EndlessObstacle.jar">
            ⬇️ Download JAR (5 MB)
        </a>
    </div>

    <hr>
    <p><a href="index.html">← Back to Portfolio</a></p>
</body>
</html>
```

Link from main page:
```html
<a href="downloads.html" class="button button-secondary">
    📥 Download Page
</a>
```

---

## 📊 Track Visitors

Add Google Analytics (optional):

1. Sign up at https://analytics.google.com
2. Create a property for your site
3. Copy the tracking code
4. Paste before `</head>` in `index.html`:

```html
<!-- Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=GA_ID"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'GA_ID');
</script>
```

---

## 🔄 Update Your Portfolio

After you make changes locally:

```bash
git add .
git commit -m "Update portfolio with new screenshots"
git push origin main
```

GitHub Pages auto-updates within 1-2 minutes! ✅

---

## 🚀 Next: Link Everything

Update your GitHub README to point to the portfolio:

```markdown
## 🎮 Play the Game

**[Play Endless Obstacle on GitHub Pages](https://roxytina.github.io/endless-obstacles/)**

or

**[Download from Releases](https://github.com/ROXYTINA/Endless_obstacles/releases)**
```

---

## 📋 Checklist

- [ ] `index.html` committed to repo root
- [ ] GitHub Pages enabled (Settings → Pages)
- [ ] Branch set to `main`, folder set to `/ (root)`
- [ ] Files pushed to main branch
- [ ] Portfolio loads at `https://roxytina.github.io/endless-obstacles/`
- [ ] Links to itch.io and GitHub working
- [ ] Download links functional
- [ ] Shared on LinkedIn/Twitter/Reddit

---

## 🎯 Full Portfolio Strategy

### Website
```
https://roxytina.github.io/endless-obstacles/
     ↓
  (Shows game info + features + screenshots)
     ↓ Links to ↙  ↓ Links to
   GitHub          itch.io
   (Source)        (Playable)
```

### Social Sharing
```
"🎮 I made an Endless Obstacle arcade game!
  → Check it out on my portfolio: [link]
  → Source: github.com/ROXYTINA/Endless_obstacles"

Tweet, LinkedIn, Discord, Reddit...
```

---

## 💡 Pro Tips

1. **Custom Domain** (Optional): 
   - Buy domain on Namecheap/GoDaddy
   - Point to GitHub Pages (instructions in GitHub docs)

2. **Custom Themes**: 
   - Use Jekyll themes (GitHub Pages native support)
   - Or just edit HTML/CSS manually

3. **README Best Practices**:
   - Include GIF of gameplay
   - List key features
   - Explain controls
   - Link to portfolio + itch.io

4. **SEO Optimization**:
   - Add `<meta description>` tag
   - Use descriptive titles
   - Include keywords in text
   - Add open graph tags for preview on social

---

## 🆘 Troubleshooting

**Q: "Pages says ready but site shows 404"**
- A: Wait 1-2 minutes for it to deploy
- Check file permissions (`index.html` must be readable)
- Ensure `index.html` is in repo root, not in a folder

**Q: "My custom CSS doesn't show"**
- A: Clear browser cache (Ctrl+Shift+R)
- Check file paths are relative: `css/style.css` not `C:\path\style.css`

**Q: "How do I unpublish?"**
- A: Settings → Pages → **Disable** GitHub Pages

**Q: "Can I use a different branch?"**
- A: Yes! Settings → Pages → Choose branch

---

## 📞 Getting Help

- GitHub Pages Docs: https://pages.github.com
- Troubleshooting: https://docs.github.com/en/pages
- Jekyll Themes: https://pages.github.com/themes/

---

**Setup Time:** ~10 minutes

Your portfolio is now live and accessible worldwide! 🌍


