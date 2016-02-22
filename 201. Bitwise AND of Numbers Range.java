    if(m==0) return 0;
    int c = 0;
    while(m!=n){
        m = m>>1;
        n = n>>1;
        c++;
    }
    return m*(int)Math.pow(2,c);
