package com.in.action;

public class MyFetcher implements Fetcher{

    final Data data;
    
    @Override
    public void fetchData(FetcherCallback callback) {
        try {
            callback.onData(data);
        } catch (Exception e) {
            callback.onError(e);
        }
    }

    public MyFetcher(Data data) {
        super();
        this.data = data;
    }

    
}
