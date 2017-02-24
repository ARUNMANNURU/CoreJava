/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringMatchingRecursion {

	/**
	 * @param args
	 */
	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private final String in="abcd";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void Permutations( final String str ){
		String in = str;
		used = new boolean[ in.length() ];
		}
		public void permute( ){
		if( out.length() == in.length() ){
		System.out.println( out );
		return;
		}
		for( int i = 0; i < in.length(); ++i ){
		if( used[i] ) continue;
		out.append( in.charAt(i) );
		used[i] = true;
		permute();
		used[i] = false;
		out.setLength( out.length() - 1 );
		}
		}
	
}
