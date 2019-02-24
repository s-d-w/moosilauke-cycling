package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.util.CompressionUtil;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MessageQueue<T extends Serializable> {

    private final Deque<byte[]> deque;

    public MessageQueue() {
        deque = new ConcurrentLinkedDeque<>();
    }

    public boolean submit(T message) throws IOException {
        byte[] data = CompressionUtil.compress(SerializationUtils.serialize(message));
        return deque.add(data);
    }

    public T getMessage() throws IOException {
        byte[] data = deque.poll();
        return data != null ? SerializationUtils.deserialize(CompressionUtil.decompress(data)) : null;
    }

    public void returnMessage(T message) throws IOException {
        byte[] data = CompressionUtil.compress(SerializationUtils.serialize(message));
        deque.addFirst(data);
    }
}
