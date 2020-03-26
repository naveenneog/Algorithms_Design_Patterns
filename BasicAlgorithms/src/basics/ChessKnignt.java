package basics;
import java.awt.Point;
import java.util.*;

public class ChessKnignt {

	public static void main(String[] args) {
		//Find the pairs of input knights by parsing the position
		//Store the knights i,j pairs in a 2D array
		//take each pair and find the attack pairs and add it to a map
		//Go over each pair and find if the error 
		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        if(t>1000 || t < 1){
        	System.out.println("Invalid input");
        }
        for (int n = 0; n < t; n++) {
            int r = sc.nextInt();
	            if(r < 1 || r > 100){
	            	System.out.println("Invalid Rows");
	            }
            int c = sc.nextInt();
	            if(c < 1 || c > 100){
	            	System.out.println("Invlid columns");
	            }
            //r rows c columns
            //Take r rows of input and c columns
	            int[][] loc = new int[r][c];
	            List<Point> klist = new ArrayList<Point>();
            for(int i = 0 ; i< r ; i++){
            	List<String> row = new ArrayList<String>();
            		String in = sc.next();
            		for(int j =0 ;j < c ; j++){
            		if(in.charAt(j) =='n'){
            			//System.out.println("Adding"+i+","+j);
            			klist.add(new Point(i, j));
            		}
            		
            	}
            }
            //System.out.println("Out of scanner");
            //For each pair find the possible moves
            HashSet<Point> validPairs = new HashSet<>() ;
            for(Point p : klist){
            	addMoves(r, c, validPairs, p);
//               // System.out.println(x+","+y);
                
            }
//            for(Point pa: validPairs){
//            	System.out.println(pa.x+","+ pa.y);
//            }
            //No need of finding inverse points
            //Check if the move of the new falls within our set
            int noOfknights2Add = 0;
            for(int i =0 ; i< r ;i++){
            	for( int j = 0 ; j < c; j ++){
            		//Check if the moves are present in out set already 
            		//Generate 8 moves 
            		//Check validity and add it to set
            		//If it doesn't contain move to next element
            		HashSet<Point> pairs = new HashSet<>();
            		addMoves( r, c, pairs, new Point(i,j));
            		boolean addKnight = true;
            		for(Point el : pairs){
            			if(!validPairs.contains(el)){
            				addKnight = false;
//            				System.out.println("Breaking the loop for point"+el.toString());
            				break;
            			}
            		}
            		
            		if(addKnight){
            			noOfknights2Add++;
            		}
            	}
            }
            System.out.println(noOfknights2Add - klist.size());
            
        }
        sc.close();
	}

	private static void addMoves( int r, int c, HashSet<Point> validPairs, Point p) {
//		System.out.println("Insude");
		int x = p.x;
		int y = p.y;
		 // initial position 
//		mpp.put(new Point( x, y ), 1); 
		 
		findValidAdd(new Point( x, y ) ,r ,c,validPairs);
		// 1-st move 
		findValidAdd(new Point( x - 2, y + 1 ) ,r ,c,validPairs);
		// 2-nd move 
		findValidAdd(new Point( x - 2, y - 1 ) ,r ,c,validPairs);
		// 3-rd move 
		findValidAdd(new Point( x + 1, y + 2 ) ,r ,c,validPairs);
		// 4-th move 
		findValidAdd(new Point( x + 1, y - 2 ) ,r ,c,validPairs);
		// 5-th move 
		findValidAdd(new Point( x - 1, y + 2 ) ,r ,c,validPairs);
		// 6-th move 
		findValidAdd(new Point( x + 2, y + 1 ) ,r ,c,validPairs);
		// 7-th move 
		findValidAdd(new Point( x + 2, y - 1 ) ,r ,c,validPairs);
		// 8-th move 
		findValidAdd(new Point( x - 1, y - 2 ) ,r ,c,validPairs);
	}
	
	//Working with 2D array?
	//Finding the duplicate or unique elements in the list 
	//
	private static  boolean findValidAdd(Point pair, int r, int c, HashSet<Point> validPairs) {
		if(pair.x < r && pair.y < c && pair.x >=0 && pair.y >=0){
			validPairs.add(pair);
			return true;
		}else{
			return false;
		}
	
		
	}
	
}

