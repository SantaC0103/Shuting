public void InsertionSort(){
    int in, out;
    
    for (out = 1; out < n; out++){  //out is dividing line
        int temp = a[out];  //remove marked item
        in = out;  //start shifts at out
        while (in > 0 && a[in -1] >= temp){
            //until one is smaller
            a[in] = a[in - 1]; //shift item right
            in--;  //go left one positin
        }
        a[in] = temp; //insert marked item
    }
}
