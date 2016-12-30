/** Problem Statement
   Given 2 strings text(t) & pattern(p) of length m & n respectively
   find the index of the first occurence of p in t if it exists
   return -1 otherwise
   
   int findMatch(char *p, char *t){
      int i,j;
      int m = strlen(t);
      int n = strlen(p);
      
      for(i = 0; i <= (m - n); i++){
          j = 0;
          while( (j < n) && (t[i+j] == p[j]))
              j++;
          if(j == n)  return i;
       }
       return -1;
    }
