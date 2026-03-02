# 🎮 JavaFX Multiplayer Platformer

A straightforward 2D multiplayer platformer built from scratch using **JavaFX**. This project was created without external game engines to explore the fundamentals of game development, including custom physics, collision logic, and basic networking.

---

## 🚀 Key Features

### 🕹️ Gameplay & Mechanics
* **Basic Physics:** Movement, jumping, and gravity implemented manually.
* **Collision Detection:** Simple logic to handle interactions between the player, ground, and objects.
* **Combat Mechanic:** Players can "shoot" by dropping blocks below them to eliminate enemies.
* **AI Entities:** Enemies that follow simple, predefined movement paths.
* **Environment Interaction:** Destructible crates containing coins; players must collect all coins to progress.

### 🌐 Multiplayer Logic
The game uses a standard **Client-Server** architecture to sync gameplay:
* **Central Server:** Manages the game world and coordinates connected clients.
* **Real-Time Sync:** Players can see each other's movements and actions across instances.
* **Multiple Connections:** Supports several clients connecting to a single server instance.

## 🔌 Connection Overview

<img width="1610" height="838" alt="image" src="https://github.com/user-attachments/assets/1ce52f2f-8f2f-4ce8-a622-037f3eb00bf3" />

The system requires one central server instance to be running. Clients connect via a dedicated port to join the shared game world.

---

## 🧠 Technical Highlights

* **Engine-Free Development:** Built using only native JavaFX libraries.
* **Physics Simulation:** Manual implementation of velocity, friction, and gravity.
* **Networking Stack:** Utilizes **Java Sockets (TCP)** for reliable data transmission between server and client.
* **Server-Authoritative Model:** Prevents desync by processing all physics and logic on the server before updating clients.
* **Object-Oriented Design:** Clean, modular architecture for entities, projectiles, and world-building.

---

## 🛠️ Technologies Used

* **Language:** Java
* **UI Framework:** JavaFX
* **Networking:** Java Sockets (TCP)
* **Architecture:** Client-Server / MVC

---

## 🎯 Learning Objectives

This project was developed to master the following concepts:

1. **Game Loop Implementation:** Managing update and render cycles.
2. **Vector Mathematics:** Calculating trajectories and movement.
3. **Network Protocols:** Designing a custom packet-based communication system.
4. **Concurrency:** Handling multiple client threads without blocking the main game thread.

---

## 🎥 Gameplay Preview

[Watch the Gameplay Demo](https://github.com/user-attachments/assets/3d8529fb-c590-4b0a-8eee-c495f205e05c)
