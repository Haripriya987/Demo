public class Delete{
    public static void main(String args[]){	
int a[]={12,4,67,8,3,55};
int n=a.length;
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
int index=2;
for(int i=index;i<n;i++){
if((i+1)!=n)
a[i]=a[i+1];
}
n--;
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}

 }
}
//
12 4 67 8 3 55
12 4 8 3 55
