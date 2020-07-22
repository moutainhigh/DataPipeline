package org.github.datapipeline.core.flink.factory;

import org.apache.flink.api.common.io.InputFormat;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.BatchTableEnvironment;
import org.apache.flink.table.expressions.Expression;
import org.github.datapipeline.core.flink.config.NodeData;

public class BatchReaderFactory {

    public static final String READ = "read";

    private static final String FORMAT = "format";

    private static final String SCHEMA = "schema";

    public static Table createReader(ExecutionEnvironment env, BatchTableEnvironment tableEnv, NodeData graphNode) {
        DataSource dataStreamSource = env.createInput(createInputFormat(graphNode));
        return tableEnv.fromDataSet(dataStreamSource, createFields(graphNode));
    }


    private static InputFormat createInputFormat(NodeData graphNode) {
        //TODO
        return null;
    }

    private static Expression[] createFields(NodeData graphNode) {
        //TODO
        return null;
    }

}
