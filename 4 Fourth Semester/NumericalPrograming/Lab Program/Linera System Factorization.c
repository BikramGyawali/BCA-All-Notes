#include<stdio.h>
#include<conio.h>
#include<math.h>
#define M 10

void main(){
	int n,i,j,k;
	double a[M][M],l[M][M],u[M][M],x[M],y[M],b[M];

	printf("How Many Unknowns ?");
	scanf("%d",&n);

	printf("\n Enter the augmented co-eff .matrix :\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++)
			scanf("%lf",&a[i][j]);
		scanf("%lf",&b[i]);
	}

	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(i<=j){
				u[i][j]=a[i][j];
				for(k=0;k<i;k++)
					u[i][j]-=l[i][k]*u[k][j];

				l[i][j]=(i==j)?1:0;
			}
			else{
				if(fabs(u[j][j])<0.00005){
					printf("\n Error: Pivot = zero");
					getch();
					return;
				}
				l[i][j]=a[i][j];
				for(k=0;k<j;k++)
					l[i][j]-=l[i][k]*u[k][j];

				l[i][j]/=u[j][j];
				u[i][j]=0;
			}
		}
	}

	printf("\n l=");
	for(i=0;i<n;i++){
		printf("\n");
		for(j=0;j<n;j++)
			printf("%10.4f",l[i][j]);
	}

	printf("\n\n u=");
	for(i=0;i<n;i++){
		printf("\n");
		for(j=0;j<n;j++)
			printf("%10.4f",u[i][j]);
	}

	for(i=0;i<n;i++){
		y[i]=b[i];
		for(j=0;j<i;j++)
			y[i]-=l[i][j]*y[j];
	}

	printf("\n \n y=\n");
	for(i=0;i<n;i++)
		printf("%10.4f",y[i]);

	for(i=n-1;i>=0;i--){
		x[i]=y[i];
		for(j=i+1;j<n;j++)
			x[i]-=u[i][j]*x[j];
		x[i]/=u[i][i];
	}

	printf("\n\n Solution [x]: \n");
	for(i=0;i<n;i++)
		printf("%10.4f",x[i]);

	getch();
}

