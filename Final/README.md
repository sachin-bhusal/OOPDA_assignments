# 🃏 Blackjack Case Study – Object-Oriented Program

## 🎯 Project Overview

This project is a console-based Blackjack game implemented in **Java** using **Object-Oriented Programming (OOP)** principles. It simulates a simple version of Blackjack where the player competes against the dealer.

The program was originally written procedurally and has been refactored to incorporate key OOP concepts like **encapsulation**, **abstraction**, and **modular design** using multiple classes.

---

## 🧩 Class Structure

### 1. `Card`
Represents a single playing card with:
- `rank` (e.g., Ace, King, 10)
- `suit` (e.g., Hearts, Spades)
- `value` (Blackjack point value: Ace = 11 initially)

### 2. `Deck`
A full 52-card deck that:
- Automatically shuffles
- Deals cards one at a time
- Reshuffles if all cards are used

### 3. `Hand`
Stores cards for either the **player** or the **dealer** and:
- Calculates total Blackjack points
- Adjusts Aces dynamically from 11 to 1 if needed

### 4. `BlackjackIO`
Handles all console **input/output**:
- Gets starting money and bet
- Prompts for "hit or stand"
- Displays cards and totals
- Asks if the user wants to play again

### 5. `BlackjackGame`
The game controller class:
- Manages the round-by-round logic
- Handles card dealing, user decisions, and game results
- Tracks player money and bet outcomes

### 6. `BlackjackApp`
The main entry point to launch the game.

---

## 🎮 Game Features

- Realistic card values and Ace handling
- User input validation
- Adjustable bet range and starting money
- Dealer logic that hits until reaching at least 17
- Automatic reshuffling when deck runs out

---

## 🧠 Blackjack Rules (Simplified)

- Blackjack payout is **3:2** (implemented via 1.5x winnings on Blackjack)
- Aces can be 11 or 1, depending on your hand
- Dealer must hit until their total is **17 or higher**
- Player busts if total exceeds 21
- Tie results in a "push"

---

## 🧪 How to Run

1. Compile all `.java` files:
   ```bash
   javac Final/*.java
   ```

2. Run the main class:
   ```bash
   java Final.BlackjackApp
   ```

---

## 🛠️ Requirements

- Java 8 or higher
- Command-line / terminal access

---

## 🙌 Author

**Sachin Bhusal**  
Rowan University – Computer Science  
Project for Week 9 Case Study: Object-Oriented Blackjack

---

## 📁 Optional Enhancements (Not implemented but possible)

- Track high score using a text file
- Add GUI using JavaFX or Swing
- Allow splitting or doubling down
- Save/load game progress

---
