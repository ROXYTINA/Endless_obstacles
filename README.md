# 🎮 Endless Obstacle

An exciting arcade-style endless runner game featuring Naruto characters! Navigate through obstacles, collect points, and achieve high scores in this fast-paced 2D game built with Java Swing.

![Java](https://img.shields.io/badge/Java-21-orange?logo=java) ![Swing](https://img.shields.io/badge/UI-Swing-blue) ![60FPS](https://img.shields.io/badge/Performance-60FPS-brightgreen)

---

## 🕹️ Game Features

- **3 Playable Characters**: Naruto, Sasuke, and Sakura with unique animations
- **Smooth 60 FPS Gameplay**: 150 updates per second for responsive controls
- **Progressive Difficulty**: Obstacles spawn faster as your score increases
- **Score Persistence**: Your high scores are automatically saved
- **Dynamic Audio**: Character-triggered sound effects and impact feedback
- **Polished UI**: Professional menu system with pause, game-over, and character selection

---

## 🎯 Quick Start

### Download & Play (Windows)

1. Download `EndlessObstacle-windows.zip` from [Releases](https://github.com/ROXYTINA/Endless_obstacles/releases)
2. Extract the ZIP folder
3. Run `EndlessObstacle.exe` (no Java installation required!)

### Alternative: Java JAR

```bash
java -jar EndlessObstacle.jar
```
Requires Java 21 or higher.

---

## 🎮 How to Play

| Key | Action |
|-----|--------|
| **← →** | Move left/right |
| **Space** | Jump |
| **ESC** | Pause |
| **Mouse** | Navigate menus |

Survive as long as possible! Each obstacle avoided increases your score. Reach 500, 1000, and 1500 points for bonuses!

---

## 📊 Display on Your Portfolio

Want to showcase this game on your portfolio? We've created comprehensive guides:

### 🌐 **[Portfolio Setup Guide](./PORTFOLIO_SETUP_GUIDE.md)** - START HERE
Complete guide for displaying your game on a portfolio website with multiple options:
- **itch.io** (recommended for game portfolios)
- **GitHub Pages** (free web hosting)
- **Custom portfolio page** (full control)

### 🎮 **[itch.io Setup Guide](./ITCH_IO_SETUP.md)**
Step-by-step instructions to publish your game on itch.io for embed + download experience.

### 🌍 **[GitHub Pages Setup](./GITHUB_PAGES_SETUP.md)**
Enable GitHub Pages to host a free portfolio website at `https://your-username.github.io/Endless_obstacles/`

### 📦 **[GitHub Releases Guide](./GITHUB_RELEASES_GUIDE.md)**
Create professional releases for game distribution with version tracking.

### 📄 **[Portfolio Homepage](./index.html)**
Ready-to-use HTML portfolio page template. Customize and deploy!

---

## 💻 Development

### Project Structure

```
platform2D/
├── src/                          # Source code
│   ├── platform2D/              # Main game loop
│   ├── Menu/                    # State machine & menu handlers
│   ├── entities/                # Player & obstacles
│   ├── UI/                      # Buttons & overlays
│   ├── keyInput/                # Input handling
│   ├── audio/                   # Sound management
│   └── utilz/                   # Utilities & loaders
├── bin/                          # Compiled classes
├── rsc/                          # Game resources (images, audio)
├── dist/                         # Build artifacts (jar, exe, zip)
└── manifest.txt                  # JAR manifest
```

### Build from Source

**Compile:**
```bash
javac -d bin -sourcepath src src/platform2D/Main.java
```

**Create JAR:**
```bash
jar --create --manifest manifest.txt --file dist\EndlessObstacle.jar -C bin .
```

**Create Windows Executable (requires jpackage):**
```bash
jpackage --type app-image \
  --input bin \
  --name EndlessObstacle \
  --main-jar EndlessObstacle.jar \
  --main-class platform2D.Main
```

---

## 🛠️ Technical Stack

| Component | Technology |
|-----------|-----------|
| **Language** | Java 21 |
| **UI Framework** | Swing/AWT |
| **Graphics** | 2D Graphics API |
| **Game Loop** | Custom delta-time accumulation |
| **Collision Detection** | AABB (Rectangle2D.Float) |
| **Audio** | WAV with javax.sound.sampled |
| **Architecture** | State Machine Pattern |
| **Packaging** | jpackage app-image |

---

## 📈 Project Stats

- **30+** sprite animations
- **5+** sound effects
- **3** playable characters
- **6** game states
- **60 FPS** rendering
- **150 UPS** updates

---

## 🎓 Learning Resources

This project demonstrates:
- ✅ Professional Java application structure
- ✅ Swing/AWT GUI development
- ✅ Game loop architecture with delta-time
- ✅ State machine pattern for UI navigation
- ✅ Event handling (mouse, keyboard)
- ✅ Resource loading and packaging
- ✅ jpackage bundling for Windows distribution
- ✅ File I/O and persistence

Perfect portfolio piece for Java developers!

---

## 🐛 Issues & Feedback

Found a bug? Have suggestions? [Create an issue](https://github.com/ROXYTINA/Endless_obstacles/issues)

---

## 📝 License

This project is open source. Feel free to fork, modify, and share!

---

## 🌟 Share Your Love

- ⭐ Star this repository if you like it
- 🎮 Play and share with friends
- 📱 Post on social media
- 💼 Add to your portfolio

---

## 🔗 Links

- 🎮 **[Play Online Portfolio](./index.html)** - View dedicated portfolio page
- 📥 **[Download](https://github.com/ROXYTINA/Endless_obstacles/releases)** - Get the latest version
- 💻 **[View Source](https://github.com/ROXYTINA/Endless_obstacles)** - GitHub repository
- 👤 **[Portfolio](https://github.com/ROXYTINA)** - Developer profile

---

**Created with ❤️ by ROXYTINA**

Built with Java | Inspired by Naruto | Made for Portfolio
