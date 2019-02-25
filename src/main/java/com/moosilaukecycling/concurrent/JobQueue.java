package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.util.CompressionUtil;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class JobQueue {

    private final Deque<byte[]> deque;

    public JobQueue() {
        deque = new ConcurrentLinkedDeque<>();
    }

    public boolean submit(Job job) throws IOException {
        byte[] compressedData = CompressionUtil.compress(SerializationUtils.serialize(job));
        return deque.add(compressedData);
    }

    public Job getJob() throws IOException {
        byte[] data = deque.poll();
        return data != null ? SerializationUtils.deserialize(CompressionUtil.decompress(data)) : null;
    }

    public void returnJob(Job job) throws IOException {
        byte[] data = CompressionUtil.compress(SerializationUtils.serialize(job));
        deque.addFirst(data);
    }
}
