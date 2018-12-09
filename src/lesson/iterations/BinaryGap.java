package lesson.iterations;

public class BinaryGap {
    public int solution(int N) {
//      if (N < 0) {
//          return 0;
//      }

      boolean trigger = false;
      int idx = 0;
      int result = 0;
      
      do {
          if (N % 2 == 1) {
              if(trigger) {
                  if(result < idx) {
                      result = idx;
                  }
                  idx = 0;
              }
              trigger = true;
              
          } else {
              if (trigger) {
                  idx += 1;
              }
          }
      } while((N = N >> 1) > 0);

      return result;
  }
}