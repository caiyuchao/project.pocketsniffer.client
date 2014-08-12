package edu.buffalo.cse.pocketsniffer;

interface AsyncTaskListener<Params, Progress, Result> {
    void onPreExecute();
    void onProgressUpdate(Progress... progress);
    void onPostExecute(Result result);
    void onCancelled(Result result);
}
