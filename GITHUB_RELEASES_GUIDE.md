# GitHub Releases & Distribution Guide

Setup GitHub Releases to distribute your game exe and jar files to players.

---

## 📦 What Are GitHub Releases?

GitHub Releases allow you to:
- ✅ Package executable/jar files for download
- ✅ Create version tags (v1.0, v1.1, etc.)
- ✅ Write release notes explaining changes
- ✅ Let players easily find latest version
- ✅ Track every version you've released

---

## 🚀 Step-by-Step: Create Your First Release

### Step 1: Prepare Your Files

Ensure you have ready:
- ✅ `EndlessObstacle-windows.zip` (the Windows executable bundle)
- ✅ `EndlessObstacle.jar` (the Java JAR file)
- ✅ Optional: Screenshots, GIF, or demo video

```
Location:
D:\My project\Endless Obstacle\platform2D\dist\
```

### Step 2: Go to Releases Page

Your repository: https://github.com/ROXYTINA/Endless_obstacles

Click **Releases** (right sidebar, or bottom area)

---

### Step 3: Create New Release

Click **"Create a new release"** or **"Draft a new release"**

Fill in:

| Field | Example |
|-------|---------|
| **Tag version** | `v1.0` |
| **Release title** | `🎮 Endless Obstacle v1.0 - Release` |
| **Description** | (see below) |

---

### Step 4: Write Release Notes

Paste something like:

```markdown
# 🎮 Endless Obstacle v1.0 - Initial Release

Welcome! This is the first public release of Endless Obstacle.

## 📥 Downloads

**Windows Users:**
- Download `EndlessObstacle-windows.zip`
- Extract the ZIP folder
- Run `EndlessObstacle.exe`
- No Java installation required!

**Java Users:**
- Download `EndlessObstacle.jar`
- Install Java 21 or higher
- Run: `java -jar EndlessObstacle.jar`

## 🎮 What's New

✨ Full game implementation
- 3 playable characters
- Progressive difficulty
- High score tracking
- Pause/Resume system
- Character selection menu

## 🕹️ Controls

- **← →** - Move Left/Right
- **Space** - Jump
- **ESC** - Pause
- **Mouse** - Menu Navigation

## 🐛 Known Issues

None reported yet! Please submit issues on GitHub.

## 🔗 Links

- 🌐 Portfolio: [GitHub Pages Link]
- 💻 Source Code: View on GitHub
- 🎮 Play Online: [itch.io Link]

---

**Enjoy the game! Leave a star ⭐ if you like it.**
```

---

### Step 5: Upload Files

**Click "Attach binaries by dropping them here or selecting them"**

Select and upload:
1. `EndlessObstacle-windows.zip`
2. `EndlessObstacle.jar`

Files will appear in "Assets" section with download counts.

---

### Step 6: Publish Release

Choose:
- ❌ **Pre-release** (if this is unstable)
- ✅ **Latest release** (if this is the final version)

Click **"Publish release"**

Your release is LIVE! 🎉

---

## 🎯 Your Release URL

After publishing, your release is at:

```
https://github.com/ROXYTINA/Endless_obstacles/releases/tag/v1.0
```

And players can download from:

```
https://github.com/ROXYTINA/Endless_obstacles/releases
```

---

## 📝 Release Naming Convention

Use semantic versioning:

| Version | When to Use |
|---------|------------|
| `v1.0` | First stable release |
| `v1.1` | Bug fixes, small improvements |
| `v2.0` | Major new features |
| `v1.0-beta` | Testing phase |
| `v1.0-hotfix` | Urgent bug fix |

---

## 🔄 Update Your Game (Patch Release)

If you fix bugs or add features:

### 1. Update Source Code
```bash
cd platform2D
rm bin/*.class
javac -d bin -sourcepath src src/platform2D/Main.java
jar --create --manifest manifest.txt --file dist\EndlessObstacle.jar -C bin .
```

### 2. Repackage Windows Zip
```bash
cd dist
jpackage --type app-image \
  --input bin \
  --name EndlessObstacle \
  --main-jar EndlessObstacle.jar \
  --main-class platform2D.Main

# Zip the app-image folder
```

### 3. Create New GitHub Release

- Tag: `v1.1`
- Title: `Endless Obstacle v1.1 - Bug Fix Release`
- Notes: List what changed
- Upload new zip + jar
- Publish

---

## 💡 Best Practices

### 1. **Always Include Release Notes**
Players want to know what's new, what's fixed, what's broken.

### 2. **Test Before Releasing**
Download the ZIP yourself, extract it, run it on a clean Windows machine.

### 3. **Use Pre-release for Beta**
Let trusted players test before a stable release.

### 4. **Keep Archives Small**
Minimum: `EndlessObstacle-windows.zip` (includes runtime - ~50-80 MB)
Alternative: `EndlessObstacle.jar` (just code - ~5 MB, needs Java)

### 5. **Version Consistently**
Use `v1.0`, `v1.1`, `v1.2`, etc. Makes it clear which is newest.

---

## 📊 Tracking Downloads

GitHub shows download stats! View on the Releases page:
- See how many times each file was downloaded
- Track which version is most popular
- Monitor player interest

---

## 🎨 Release Template (Copy-Paste Ready)

Create a template file `RELEASE_TEMPLATE.md` for faster releases:

```markdown
# 🎮 Endless Obstacle vX.X - [Release Type]

## 📥 Downloads

### Windows (Recommended)
- **EndlessObstacle-windows.zip** - No Java required

### Java
- **EndlessObstacle.jar** - Requires Java 21+

## ✨ What's New in This Version

### Added
- [ ] Feature 1

### Fixed
- [ ] Bug 1

### Improved
- [ ] Performance improvement 1

## 🕹️ How to Play

[Copy controls from elsewhere]

## 🔗 Links

- 🌐 Portfolio: https://roxytina.github.io/endless-obstacles/
- 🎮 Play Online: https://itch.io/game/endless-obstacle
- 👨‍💻 Source Code: https://github.com/ROXYTINA/Endless_obstacles

## 🐛 Report Issues

Found a bug? [Create an issue](https://github.com/ROXYTINA/Endless_obstacles/issues)

---

**Thank you for playing! ⭐**
```

---

## 🎯 Complete Distribution Workflow

```
1. Update & Test Code
          ↓
2. Recompile & Build
          ↓
3. Package Files (exe, jar)
          ↓
4. Test on Clean Machine
          ↓
5. Create GitHub Release
          ↓
6. Add to itch.io
          ↓
7. Share on Portfolio + Social
```

---

## ✅ Checklist for Release

- [ ] All bugs fixed in this version
- [ ] Code committed to GitHub
- [ ] Executable tested and works
- [ ] JAR tested and works
- [ ] Files compressed (zip/jar)
- [ ] Release notes written
- [ ] Tag version number assigned
- [ ] Assets uploaded
- [ ] Release published
- [ ] Link updated on portfolio
- [ ] Shared on social media (optional)

---

## 🎊 After Release

1. **Update README.md** with new version number
2. **Update portfolio page** with download link
3. **Post on itch.io** if you published there too
4. **Share on Twitter/LinkedIn** with download link
5. **Get feedback** from players

---

## 🆘 Common Issues

**Q: "Can I delete a release?"**
- A: You can delete releases on the Releases page (but saved downloads won't disappear)

**Q: "Can I edit a release?"**
- A: Yes! Click "Edit" on the release page

**Q: "How do I make a pre-release?"**
- A: When creating release, check "This is a pre-release" before publishing

**Q: "Players downloaded old version, how do I notify them?"**
- A: GitHub shows "Latest" badge - users will see it. Consider posting update announcement.

---

## 🚀 You're Ready!

Your game can now be:
- ✅ Distributed professionally on GitHub
- ✅ Downloaded by thousands of players
- ✅ Version-tracked and updated easily
- ✅ Shared across portfolios and social media

**Keep building, keep sharing! 🎮**


