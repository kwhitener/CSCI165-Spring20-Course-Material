public class SolitaireCipher{

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";             // plain text alphabet
        int[]  cardDeck = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16, // "card deck". Joker A = 27, Joker B = 28
                            17,18,19,20,21,22,23,24,25,26,27,28};

    }
    
    /**
     * Prepares the "A" Joker for keystream generation
     * Finds 27 and exchanges it with card after
     * Calls the helper method "find"
     * @param deck
     */
    public static void exchangeAJoker(int[] deck){          // implements step 1 in keystream generation 
        int position = findCard(deck, 27);                  // call helper

        int temp = deck[position];                          // copy A Joker to temp location
                                  
        deck[position] = deck[(position + 1) % deck.length];// move "after" card. Up one position. Handle loop
        deck[(position + 1) % deck.length] = temp;          // place A Joker down one position. Handle loop
    }

    /**
     * Prepares the "B" Joker for keystream generation
     * Finds 28 and exchanges with two cards after
     * @param deck
     */
    public static void exchangeBJoker(int[] deck){          // implements step 2 in keystream generation 
        int position = findCard(deck, 28);                  // call helper

        int temp = deck[position];                          // copy B Joker to temp location

        // exchange items, handling loop
        deck[position] = deck[(position + 1) % deck.length]; // swap first item
        deck[(position + 1) % deck.length]  = deck[(position + 2) % deck.length];// swap second item
        deck[(position + 2) % deck.length]  = temp;          // place A Joker down one position
    }

    // TO DO: Finish these methods

    public static void shuffleDeck(int[] deck){}            // randomize the deck yourself. No shortcuts
    public static void tripleCut(int[] deck){}              // implements step 3
    public static void sliceFront(int[] deck){}             // implements step 4
    public static int  generateKeystreamValue(int[] deck){  // implements step 5
        int keyStreamValue = 0;
        return keyStreamValue;
    }  
    public static int[] generateKeystream(){
        int[] keystream = null;
        return keystream;
    }
    public static String prepareMessage(String message){    // removes all non-alpha characters from "message"
        String prepared = null;                             // applies uppercase. Research String API
        return prepared;                                    // pads to factor of 5 characters
    }
    public static String encode(String message){            // applies encoding to "message"
        String encoded = "";
        return encoded;
    }  
    public static String decode(String message){            // applies decoding to "message"
        String decoded = "";
        return decoded;
    } 

    
    // HELPER METHODS: Define your helpers below here
    /**
     * finds the position of the specified card 
     * @param deck
     * @param card
     * @return
     */
    public static int findCard(int[] deck, int card){
        for(int index = 0; index < deck.length; ++index)
            if(deck[index] == card)
                return index;
        return -1;  // didn't find it. Should not need this, but compiler wants it.
    }
}