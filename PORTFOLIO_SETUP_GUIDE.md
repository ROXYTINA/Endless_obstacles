# Portfolio Setup Guide - Endless Obstacle Game

This guide will help you display and share your Endless Obstacle game on your portfolio.

## Option 1: itch.io (Recommended) ⭐

itch.io is the best platform for game portfolios. It allows players to:
- Download and play on Windows (your built executable)
- Play in-browser with WebGL
- Comment and rate your game

### Step-by-Step Setup:

#### 1. Create itch.io Account
- Go to https://itch.io/register
- Sign up with email or GitHub account
- Verify email

#### 2. Create a Game Project
- Click "Create" → "New Project"
- Fill in:
  - **Project Title**: "Endless Obstacle"
  - **Project URL**: `endless-obstacle` (or similar)
  - **Classification**: Game
  - **Kind of project**: HTML, but we'll upload Windows executable instead

#### 3. Configure Game Details
- **Description**: 
  ```
  An endless runner game featuring Naruto characters! Survive increasingly 
  difficult obstacles, collect power-ups, and beat your high score. Features 
  smooth 60 FPS gameplay with multiple characters to choose from.
  ```
- **Tags**: `naruto`, `endless-runner`, `arcade`, `action`, `2d`
- **Genre**: Action, Arcade
- **Audience**: Everyone

#### 4. Upload Game Files
- **Windows Executable**: Upload `dist/EndlessObstacle-windows.zip`
  - This contains the .exe + bundled runtime (no Java installation needed)
  - Set as "Default" and "Play in Browser"
- Alternatively, upload `dist/EndlessObstacle.jar` (requires Java installed)

**File to Upload**: Choose one:
- ✅ **RECOMMENDED**: `D:\My project\Endless Obstacle\platform2D\dist\EndlessObstacle-windows.zip`
  - Why: No Java required, run-anywhere executable
- Alternative: `D:\My project\Endless Obstacle\platform2D\dist\EndlessObstacle.jar`
  - Why: Smaller file size, but requires Java 21+

#### 5. Enable Features
- ✅ Enable "Download" (people can download the zip)
- ✅ Enable direct support if you want to accept donations
- Add screenshots/GIFs of gameplay

#### 6. Get Embed Code
- Once published, view your project page
- Click "Share" → Look for embed code
- Or use this format:
  ```html
  <iframe frameborder="0" src="https://itch.io/embed/GAME_ID?dark=true" 
          width="552" height="167"></iframe>
  ```

---

## Option 2: Portfolio HTML Page (Use in Your Personal Site)

Create an HTML file you can add to your portfolio website:

### A. Simple Portfolio Page:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Endless Obstacle - Game Portfolio</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 40px 20px;
        }
        .container {
            max-width: 1000px;
            margin: 0 auto;
            background: white;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 20px 60px rgba(0,0,0,0.3);
        }
        header {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 60px 40px;
            text-align: center;
        }
        h1 {
            font-size: 3em;
            margin-bottom: 10px;
            text-shadow: 2px 2px 4px rgba(0,0,0,0.3);
        }
        .subtitle {
            font-size: 1.2em;
            opacity: 0.95;
            margin-bottom: 20px;
        }
        .tags {
            display: flex;
            justify-content: center;
            gap: 10px;
            flex-wrap: wrap;
        }
        .tag {
            background: rgba(255,255,255,0.2);
            padding: 6px 12px;
            border-radius: 20px;
            font-size: 0.9em;
        }
        .content {
            padding: 40px;
        }
        .about {
            margin-bottom: 40px;
            line-height: 1.8;
            color: #333;
        }
        .about h2 {
            margin-bottom: 15px;
            color: #667eea;
            font-size: 1.8em;
        }
        .features {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            margin: 20px 0;
        }
        .feature-card {
            background: #f8f9fa;
            padding: 20px;
            border-radius: 8px;
            border-left: 4px solid #667eea;
        }
        .feature-card h3 {
            color: #667eea;
            margin-bottom: 8px;
        }
        .buttons {
            display: flex;
            gap: 15px;
            justify-content: center;
            margin: 30px 0;
            flex-wrap: wrap;
        }
        .button {
            padding: 12px 30px;
            border-radius: 6px;
            text-decoration: none;
            font-weight: 600;
            cursor: pointer;
            border: none;
            font-size: 1em;
            transition: all 0.3s ease;
        }
        .button-primary {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
        }
        .button-primary:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
        }
        .button-secondary {
            background: #e0e0e0;
            color: #333;
        }
        .button-secondary:hover {
            background: #d0d0d0;
        }
        .tech-stack {
            background: #f8f9fa;
            padding: 20px;
            border-radius: 8px;
            margin: 20px 0;
        }
        .tech-stack h3 {
            color: #667eea;
            margin-bottom: 15px;
        }
        .tech-list {
            display: flex;
            gap: 10px;
            flex-wrap: wrap;
        }
        .tech {
            background: white;
            padding: 8px 15px;
            border-radius: 6px;
            border: 1px solid #ddd;
            font-size: 0.9em;
        }
        .embed-section {
            margin: 30px 0;
            background: #f8f9fa;
            padding: 20px;
            border-radius: 8px;
            border: 2px dashed #667eea;
        }
        .embed-section h3 {
            color: #667eea;
            margin-bottom: 15px;
        }
        iframe {
            max-width: 100%;
            border-radius: 8px;
        }
        footer {
            background: #f8f9fa;
            padding: 20px;
            text-align: center;
            border-top: 1px solid #ddd;
            color: #666;
        }
        @media (max-width: 768px) {
            h1 { font-size: 2em; }
            .buttons { flex-direction: column; }
            .button { width: 100%; }
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>🔥 Endless Obstacle 🔥</h1>
            <p class="subtitle">An Arcade Endless Runner Game</p>
            <div class="tags">
                <span class="tag">Java Swing</span>
                <span class="tag">Game Development</span>
                <span class="tag">Arcade</span>
                <span class="tag">Action</span>
            </div>
        </header>

        <div class="content">
            <div class="about">
                <h2>About the Game</h2>
                <p>
                    <strong>Endless Obstacle</strong> is a fast-paced arcade game where you survive increasingly difficult 
                    obstacles while collecting power-ups. Navigate through Naruto-themed environments with smooth 60 FPS gameplay 
                    and multiple character choices. How long can you survive?
                </p>
            </div>

            <h2 style="color: #667eea; margin-bottom: 15px;">🎮 Game Features</h2>
            <div class="features">
                <div class="feature-card">
                    <h3>⚡ Smooth Gameplay</h3>
                    <p>60 FPS rendering with 150 updates per second for responsive controls</p>
                </div>
                <div class="feature-card">
                    <h3>🎭 Multiple Characters</h3>
                    <p>Play as Naruto, Sasuke, or Sakura with unique animations</p>
                </div>
                <div class="feature-card">
                    <h3>🎯 Progressive Difficulty</h3>
                    <p>Obstacles spawn faster and more frequently as your score increases</p>
                </div>
                <div class="feature-card">
                    <h3>💾 Score Persistence</h3>
                    <p>Your high score is automatically saved and loaded</p>
                </div>
                <div class="feature-card">
                    <h3>🎵 Dynamic Audio</h3>
                    <p>Character-triggered sound effects with collision feedback</p>
                </div>
                <div class="feature-card">
                    <h3>📱 Responsive UI</h3>
                    <p>Polished menu system with pause, game-over, and character selection screens</p>
                </div>
            </div>

            <h2 style="color: #667eea; margin-bottom: 15px;">🕹️ How to Play</h2>
            <div class="about">
                <ul style="margin-left: 20px; line-height: 1.8;">
                    <li><strong>Arrow Keys</strong> - Move left/right</li>
                    <li><strong>Space</strong> - Jump (avoid obstacles)</li>
                    <li><strong>Mouse</strong> - Navigate menus</li>
                    <li><strong>ESC</strong> - Pause game</li>
                </ul>
                <p style="margin-top: 15px;">
                    Survive as long as possible! Each obstacle you avoid increases your score. 
                    Reach milestones at 500, 1000, and 1500 points for bonus effects!
                </p>
            </div>

            <div class="tech-stack">
                <h3>🛠️ Technical Stack</h3>
                <div class="tech-list">
                    <span class="tech">Java 21</span>
                    <span class="tech">Swing UI</span>
                    <span class="tech">2D Graphics</span>
                    <span class="tech">Custom Game Loop</span>
                    <span class="tech">WAV Audio</span>
                    <span class="tech">State Machine</span>
                </div>
            </div>

            <div style="text-align: center; margin: 40px 0;">
                <h2 style="color: #667eea; margin-bottom: 20px;">🎮 Play Now</h2>
                <div class="buttons">
                    <a href="https://itch.io/embed/GAME_ID" target="_blank" class="button button-primary">
                        Play on itch.io
                    </a>
                    <a href="https://github.com/ROXYTINA/Endless_obstacles/releases" target="_blank" class="button button-secondary">
                        Download (GitHub)
                    </a>
                </div>
            </div>

            <div class="embed-section">
                <h3>📺 Embedded Game (itch.io)</h3>
                <p style="margin-bottom: 15px; color: #666;">
                    Once published on itch.io, the game will appear here. Players can download and play directly!
                </p>
                <!-- Replace GAME_ID with your itch.io game ID -->
                <!-- <iframe frameborder="0" src="https://itch.io/embed/GAME_ID?dark=true" 
                        width="552" height="167"></iframe> -->
                <p style="text-align: center; color: #999; padding: 40px 20px; background: white; border-radius: 6px;">
                    🎮 Game embed will appear here once published on itch.io
                </p>
            </div>

            <h2 style="color: #667eea; margin-bottom: 15px;">📊 Project Stats</h2>
            <div class="features">
                <div class="feature-card">
                    <h3>30+</h3>
                    <p>Custom sprite animations</p>
                </div>
                <div class="feature-card">
                    <h3>5+</h3>
                    <p>Sound effects & music tracks</p>
                </div>
                <div class="feature-card">
                    <h3>3</h3>
                    <p>Playable characters</p>
                </div>
                <div class="feature-card">
                    <h3>6</h3>
                    <p>Different game states</p>
                </div>
            </div>

        </div>

        <footer>
            <p>Endless Obstacle © 2025 | <a href="https://github.com/ROXYTINA/Endless_obstacles" target="_blank" style="color: #667eea; text-decoration: none;">View on GitHub</a></p>
        </footer>
    </div>
</body>
</html>
```

---

## Option 3: GitHub Pages (Free Hosting)

### Setup GitHub Pages:

1. Go to your GitHub repo: https://github.com/ROXYTINA/Endless_obstacles
2. Under **Settings** → **Pages**
3. Set source to: `main branch / root`
4. GitHub will provide a URL like: `https://ROXYTINA.github.io/Endless_obstacles/`
5. Create/upload an `index.html` file to your repo root
6. Your portfolio page will be live!

### File Structure:
```
Endless_obstacles/
├── index.html              (your portfolio page)
├── assets/
│   ├── screenshot1.png
│   ├── screenshot2.png
│   └── gameplay.gif
├── releases/               (or link downloads here)
└── README.md
```

---

## Option 4: Embed as Web Game (Advanced)

If you want to make the game playable directly in browser (no download):

### Convert Java to JavaScript:
- Use **TeaVM** or **Excelsior** to compile Java to JavaScript
- Or use **libGDX** + **GWT** for web export
- **Estimated effort**: 20-40 hours

This is more complex but allows true browser play without downloads.

---

## Quick Action Plan

### ✅ TODAY (30 minutes):
1. [ ] Upload Windows exe to itch.io
2. [ ] Get embed code
3. [ ] Create portfolio HTML page
4. [ ] Enable GitHub Pages
5. [ ] Add `index.html` to your repo

### 📌 This Week:
1. [ ] Add screenshots/GIFs to your itch.io project
2. [ ] Add portfolio link to GitHub README
3. [ ] Share on social media

### Long-term:
1. [ ] Collect player feedback
2. [ ] Add more content (characters, levels, themes)
3. [ ] Consider web port if portfolio needs it

---

## Direct Links & Resources

- **itch.io**: https://itch.io - Create account, publish your game
- **GitHub Pages Docs**: https://pages.github.com
- **Screenshots**: Use `print screen` during gameplay or use OBS Studio
- **GIF Recording**: Use ScreenToGif or ShareX

---

## File Locations for Upload

```
Windows Executable (RECOMMENDED):
D:\My project\Endless Obstacle\platform2D\dist\EndlessObstacle-windows.zip

Alternate:
D:\My project\Endless Obstacle\platform2D\dist\EndlessObstacle.jar
```

---

## Troubleshooting

**Q: Players can't run the .exe?**
- A: Ensure they extract the zip folder (don't run from zip). The `EndlessObstacle.exe` bundles Java runtime.

**Q: Where do I get my itch.io game ID?**
- A: Check your game URL: `https://itch.io/game/YOUR_GAME_ID` - the ID is in the URL

**Q: How do I add screenshots?**
- A: On your itch.io project, click "Edit Game" → "Uploads" → Add image files

**Q: Can I update the game later?**
- A: Yes! Re-upload a new version to itch.io; players download the latest automatically


