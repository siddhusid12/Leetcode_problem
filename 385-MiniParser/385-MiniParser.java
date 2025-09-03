// Last updated: 9/3/2025, 10:08:01 AM
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {

  public NestedInteger deserialize(String s) {

    if(s.charAt(0) != '[' && s.charAt(0) != ']') return new NestedInteger(Integer.parseInt(s));

    Deque<NestedInteger> q = new ArrayDeque<>();

    int startpos = 0;

    for(int i=0; i<s.length(); i++){

      switch(s.charAt(i)){

        case '[':

              q.push(new NestedInteger());

              startpos = i + 1;

              break;

        case ',':

              if(i>startpos) {

                int num = Integer.parseInt(s.substring(startpos,i));

                q.peek().add(new NestedInteger(num));

              }

              startpos = i + 1;

              break;

        case ']':

              NestedInteger original = q.pop();

              if(i>startpos) {

                int num = Integer.parseInt(s.substring(startpos,i));

                original.add(new NestedInteger(num));

              }

              if(!q.isEmpty()) q.peek().add(original);

              else return original;

              startpos = i + 1;

              break;

      }

    }

    throw new IllegalArgumentException();

  }

}