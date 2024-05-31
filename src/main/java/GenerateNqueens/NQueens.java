package GenerateNqueens;

public class NQueens {
    public char[][] arr;
    public int size;
    public void addSize(int s){
        size=s;
        arr=new char[size][size];
    }
    public void generatenqueens(){
        if (size==0){
            System.out.println("Size is not defined yet or size is 0");
            System.exit(1);
            
        }
        else {
            generatenqueens(arr, 0, -1);
        }
    }
    public int generatenqueens(char[][] arr,int row,int count){

        if(row==arr.length){
            if(count==-1){
                printNqueens();
            }
            else {
                count++;
            }
            return count;
        }
        for(int col=0;col<arr[0].length;col++){
            if(cankeepQueen(arr,row,col)){
                arr[row][col]='Q';
                count=generatenqueens(arr,row+1,count);
                arr[row][col]='\0';
            }
        }
        return count;
    }
    public int Nways(){
        if(arr==null){
            System.out.println("Size is not defined");
            return 0;
        }
        else {
            return generatenqueens(arr,0,0);
        }
    }
    private void printNqueens(){
        if(arr==null){
            System.out.println("Size is not defined yet");
            return;
        }
        for(char[] i:arr){
            for(char ch:i){
                if(ch=='Q'){
                    System.out.print('Q');
                }
                else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
        for (int i=0;i<=arr.length;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    private boolean cankeepQueen(char[][] arr,int row,int col){
        for(int i=0;i<arr[0].length;i++){
            if(arr[row][i]=='Q'){
                return false;
            }
        }
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        int r=row,c=col;
        while(c>=0&&r>=0){
            if(arr[r--][c--]=='Q'){
                return false;
            }
        }
        r=row;
        c=col;
        while(c<arr[0].length&&r>=0){
            if(arr[r--][c++]=='Q'){
                return false;
            }
        }
        return true;
    }
}

