/*
Algorithms 4ed
2016.11.3
P25(CH)
Haimo Xu
*/
// find the max of an array
int[] Myarray = new int[N];
int Max = Myarray[0];
for(int i = 1; i < Myarray.length; i++) {
	if(Myarray[i]>Max)
		Max = Myarray[i];
}

// calculate the average of an array
double sum=0;
for(int i = 0; i<Myarray.length; i++) {
	sum = sum + Myarray[i];
}

double average = sum/Myarray.length;

//copy an array
int N = Myarray.length;
int[] b = new int[N];

for(int i = 0; i<N;i++) {
	b[i] = Myarray[i];
}

//reverse an array
for(int i = 0;i<Myarray.length/2;i++){
	double temp = Myarray[i];
	Myarray[i] = Myarray[Myarray.length-1-i];
	Myarray[Myarray.length-1-i] = temp;
}
// teo identical method to declare, create and initialize an array
//method #1

double[][] arrayA = new double[M][N];

//method #2
double[][] a;
a = new double[M][N]
for(int i = 0; i<M; i++)
	for(int j = 0; j<N; j++)
		a[i][j] = 0.0;


