package com.moosilaukecycling.util;

import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import net.jpountz.lz4.LZ4Factory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CompressionUtil {

    private CompressionUtil() { }

    public static byte[] compress(byte[] data) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        LZ4BlockOutputStream lz4BlockOutputStream = new LZ4BlockOutputStream(
                byteArrayOutputStream, 2048, LZ4Factory.fastestInstance().fastCompressor());
        lz4BlockOutputStream.write(data);
        lz4BlockOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] decompress(byte[] data) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        LZ4BlockInputStream lz4BlockInputStream = new LZ4BlockInputStream(
                new ByteArrayInputStream(data), LZ4Factory.fastestInstance().fastDecompressor());
        int bytes;
        byte[] byteBuffer = new byte[2048 * 256];
        while (-1 != (bytes = lz4BlockInputStream.read(byteBuffer))) {
            byteArrayOutputStream.write(byteBuffer, 0, bytes);
        }
        lz4BlockInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
