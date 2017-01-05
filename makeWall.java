public boolean makeBricks(int small, int big, int goal) {
  int remainder;
  if(goal>big*5) remainder = goal - (big*5);
  else remainder = goal % 5;
  if(remainder>small) return false;
  else return true;
}
