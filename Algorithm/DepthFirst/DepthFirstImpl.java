import  java.util.LinkedList;
import  java.util.Stack;

public class DepthFirstImpl {


	private int vertex; //  total number of vertices
	private LinkedList<Integer> adjList[ ];// create adjancey list to store graph
	private Stack<Integer> stack;// create stack to store values while traversing through the gragh

	//  constructor for assiging values
	DepthFirstImpl(int vertex){

	this.vertex = vertex; // assign number of vertices
	adjList = new LinkedList[vertex]; // create LinkedList object and assign the size of the linkelist
	
	for ( int i =0; i< vertex; i++){
	
		adjList[i] = new LinkedList<>(); // create LinkedList for each vertex to store vertices connected to it
	}

	stack = new Stack<Integer>();



	}

	// add edges of the graph to adjacency list
	void addEdge(int source, int destination){

		adjList[source].add(destination);
	}

	// Depth first algorithm implementation
	void DepthFirstAlgorithm(int rootNode){

	boolean visitedNodes[] = new boolean[vertex]; // create boolean array to store nodes already visited once
	int b = 0;
	int element =0;
	
	visitedNodes[rootNode] =true;
	stack.push(rootNode);

	while (stack.isEmpty()==false){

	element= stack.pop(); / /get last element out from the stack
	System.out.print(element+" ");  // print that element

		// get size of  element vertex LinkedList  and repeat the for loop until i less than LinkedList size
		for(int i=0; i < adjList[element].size();i++){
		
			b= adjList[element].get(i); // get the correspondant index value of  specific element vertex LinkedList
			
			//check the b node is already visted
			if (!visitedNodes[b]){

				visitedNodes[b] = true; // b node is not visted then assign true value to b index  in the vistedNodes array
				stack.push(b); // then add b element to the stack
			}
		}

	}

	}


	public static void main(String args[]){

	DepthFirstImpl graph = new DepthFirstImpl(8);// create object and pass the total number of nodes to the constructor

	// add edges
	graph.addEdge(0,3);
	graph.addEdge(3,5);
	graph.addEdge(5,6);
	graph.addEdge(6,2);
	graph.addEdge(2,1);
	graph.addEdge(3,7);
	graph.addEdge(7,4);
		

	System.out.print( "DFS  Traversal: "); // print the Depth first algorithm for traversing graph data structurre

	graph.DepthFirstAlgorithm(0);// call the Depth first algorithm function and pass the root node





                  }

}