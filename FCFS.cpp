#include<stdio.h>
int main()
{
	int ar[20], exe[20], i, n, worktime=0;
	float wtavg;
	printf("\nEnter the number of processes");
	scanf("%d", &n);
	int serv[n];
	serv[0]=0;
	printf("arrival time\n");
	for(i=0; i<n; i++)
		scanf("%d", &ar[i]);
	printf("execution time\n");
	for(i=0; i<n; i++)
		scanf("%d", &exe[i]);
	for(i=1; i<n; i++)
		serv[i]=serv[i-1]+exe[i-1];
	for(i=1; i<n; i++)
		worktime = worktime+(serv[i]-ar[i]);
	wtavg=(float)worktime/n;
	printf("average worktime is %f\n", wtavg);
}
