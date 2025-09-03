// Last updated: 9/3/2025, 10:09:10 AM
class Solution {
  public String simplifyPath(String path) {
    final String[] dirs = path.split("/");
    Stack<String> stack = new Stack<>();

    for (final String dir : dirs) {
      if (dir.isEmpty() || dir.equals("."))
        continue;
      if (dir.equals("..")) {
        if (!stack.isEmpty())
          stack.pop();
      } else {
        stack.push(dir);
      }
    }

    return "/" + String.join("/", stack);
  }
}