/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.metadatahive2.inputformat;

import com.dtstack.metadata.rdb.builder.MetadatardbBuilder;

import java.util.Map;

/**
 * Date: 2020/05/26
 * Company: www.dtstack.com
 *
 * @author tudou
 */
public class Metadatehive2InputFormatBuilder extends MetadatardbBuilder {
    private Metadatahive2InputFormat format;


    public Metadatehive2InputFormatBuilder(Metadatahive2InputFormat format) {
        super(format);
        this.format = format;
    }

    public void setHadoopConfig(Map<String,Object> hadoopConfig) {
        format.hadoopConfig = hadoopConfig;
    }

}
