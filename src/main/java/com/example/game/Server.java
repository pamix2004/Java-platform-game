package com.example.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable{
    private ServerSocket socket;
    /**
     * A list of integers that stores clients' sockets.
     * */
    private ArrayList<Socket> connectedClients;
    private boolean gameHasStarted = false;
    private int port;

    public int getPort(){
        return this.port;
    }

    public Server(int port) throws IOException, ClassNotFoundException {
        this.port = port;
        this.socket = new ServerSocket(port, 0, InetAddress.getByName("localhost"));
        System.out.println("The server has been set up");
        this.connectedClients = new ArrayList<>();
    }

    /**
     * It changes the state of <code>gameHasStarted</code> to True.
     * */
    public void startGame(){
        this.gameHasStarted = true;
    }

    /**
     * It makes serverSocket stop listening for new joining clients, however it will still be able to communicate
     * with previously connected sockets.
     * */
    public void stopListeningForIncomingConnections() throws IOException {
        socket.close();
    }

    @Override
    public void run() {
        //It's listening for incoming connection, it stops running when gameHasStarted
        while(!socket.isClosed()){
            if(gameHasStarted)
                break;
            System.out.println("It is checking for incoming connections all the time");
            //It blocks because accepting is a while loop until a new user connects
            Socket clientSocket = null;
            try {
                clientSocket = socket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
                //Add sockets to the list so server has easy access in future
                connectedClients.add(clientSocket);

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("It throws an exception,however it might be due to the fact that serverSocket was closed");
            }


            //It happens after new user has been connected with our server

        }

        if(gameHasStarted){
            System.out.println("It happens for once!,it should tell clients to load a map");
        }
    }

    private class ClientHandler extends Thread{
        private Socket socket;
        private int clientPort;
        public ClientHandler(Socket socket) throws IOException, ClassNotFoundException {
            this.socket = socket;
            this.clientPort = socket.getPort();
            System.out.println("SERVER: New user has connected");
        }
        @Override
        public void run() {
            while(this.socket.isConnected()){
                //System.out.println("SERVER: It listens for user "+clientPort);
            }
        }
    }


}
