package io.unlogged.logging;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.insidious.common.weaver.ClassInfo;

import java.util.List;

public class DiscardEventLogger implements IEventLogger {

    private final ObjectMapper objectMapper = new ObjectMapper();
    ;

    @Override
    public void close() {

    }

    @Override
    public Object getObjectByClassName(String name) {
        return null;
    }

    @Override
    public void recordEvent(int dataId, Object value) {

    }

    @Override
    public void recordEvent(int dataId, int value) {

    }

    @Override
    public void recordEvent(int dataId, long value) {

    }

    @Override
    public void recordEvent(int dataId, byte value) {

    }

    @Override
    public void recordEvent(int dataId, short value) {

    }

    @Override
    public void recordEvent(int dataId, char value) {

    }

    @Override
    public void registerClass(Integer id, Class<?> type) {

    }

    @Override
    public void recordEvent(int dataId, boolean value) {

    }

    @Override
    public void recordEvent(int dataId, double value) {

    }

    @Override
    public void recordEvent(int dataId, float value) {

    }

    @Override
    public void recordWeaveInfo(byte[] byteArray, ClassInfo classIdEntry, List<Integer> probeIdsToRecord) {

    }

    @Override
    public void setRecording(boolean b) {

    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public ClassLoader getTargetClassLoader() {
        return this.getClass().getClassLoader();
    }
}
