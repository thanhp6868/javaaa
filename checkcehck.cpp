#include <iostream>
#include <math.h>
using namespace std;

int a[100];

void tinhTrungBinhCongSNT(int n)
{
    int s = 0;
    int count = 0;
    double tbc;
    for (int i = 0; i < n; i++)
    {
        int dem = 0;
        if (a[i] == 2)
           { s += 2; count++;}
        else
        {

            for (int j = 2; j <= sqrt(a[i]); j++)
            {
                if (a[i] % j == 0)
                    dem++;
            }
            if (dem == 0)
            {
                s += a[i];
                count++;
            }
        }
    }
    if (count == 0)
        cout << "khong co so nguyen to nao trong mang";
    else
    {
        tbc = s / count;
        cout << tbc;
    }
}

void timSoHoanHaoMax(int n)
{

    int min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        int sum = 0;
        for (int j = 1; j <= a[i] / 2; j++)
            {
                if (a[i] % j == 0)
                    sum += j;
            }

        if (sum == a[i])
            if (min > a[i])
                min = a[i];
    }
    cout << "So hoan hao nho nhat cua mang vua nhap: " << min << endl;
}

void timSoCoTongChuSoLonNhat(int n){
    int max =INT_MIN;
    int vt=0;
    for (int i = 0; i < n; i++)
    {
        int sum =0;
        while(a[i]!=0){
            int tg = a[i]%10;
            a[i]=(a[i]-tg)/10;
            sum+=tg;
        }
        if(max<sum)
            {
                max = sum;
                vt=i;
            }
    
    }
    cout<<"so co tong lon nhat: "<<a[vt];
}

int main()
{
    int n;
    cout << "nhap n: ";
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cout << "so thu " << i + 1 << ": ";
        cin >> a[i];
    }
    tinhTrungBinhCongSNT(n);
    cout << endl;
    timSoHoanHaoMax(n);
    cout<<endl;
    timSoCoTongChuSoLonNhat(n);
    return 0;
}