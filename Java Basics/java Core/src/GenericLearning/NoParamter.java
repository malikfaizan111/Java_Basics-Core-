package GenericLearning;

@SuppressWarnings("unchecked")
class NooParam<T>
{
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        A[length++] = v;
    }

    public void display()
    {
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
@SuppressWarnings("unchecked")
public class NoParamter {
     
    public static void main(String[] args) {
        NooParam ma = new NooParam<>();
        ma.append(10);
        ma.append(20);
        ma.append("string also");
        ma.display();
    }
}
