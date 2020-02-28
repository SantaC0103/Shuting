public void BubbleSort(){

int out, in;
        
    for (out = n - 1; out > 1; out--) //外部循环
        for (in = 0; in < out; in++) //内部循环
            if(a[in] > a[in + 1]){  //交换位置
                int temp = a[in];
                a[in] = a[in + 1];
                a[in + 1] = temp;
                }
    }
