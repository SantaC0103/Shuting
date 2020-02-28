public void SelectionSort(){
    int out, in, min;
    
    for (out = 0; out < n - 1; out++){ //外部循环
        min = out;  //选择初始值作为最小
        for (in = out + 1; in < n; in++)  //内部循环
            if (a[in] < a[min])  //一次循环选出最小值的Index
                min = in; 
        int temp = a[out];  //交换初始值和最小值
        a[out] = a[min];
        a[min] = temp; 
    }
}
