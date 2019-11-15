/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dexecutor.core;

import com.github.dexecutor.core.graph.DependencyAware;
import com.github.dexecutor.core.graph.Traversar;
import com.github.dexecutor.core.graph.TraversarAction;
import com.github.dexecutor.core.task.ExecutionResults;
import com.sun.tools.javac.util.Pair;

import java.util.List;

/**
 * Main Interface for Dexecutor framework, It provides api to build the graph and and to kick off the execution.
 * 
 * @author Nadeem Mohammad
 * 
 * @see com.github.dexecutor.core.DefaultDexecutor
 *
 * @param <T> Type of Node/Task ID
 * @param <R> Type of Node/Task result
 */
public interface Dexecutor<T, R> extends DependencyAware<T> {	
	/**
	 * Kicks off the execution of the nodes based on the dependency graph constructed, using {@code addDepen***} apis
	 * 
	 * @param config based on which execution should proceed.
	 * 
	 * @return {@link ExecutionResults} the results
	 */
	ExecutionResults<T, R> execute(final ExecutionConfig config);

	/**
	 * get all processed task execute result list
	 * @return all task execute result
	 */
	public List<Pair<T,R>> getAllProcessedResult();

	/**
	 * After a dexecutor crash, create a new instance of dexecutor and call this method for recovery
	 * @param config based on which execution would recover
	 */
	void recoverExecution(final ExecutionConfig config);
	/**
	 * Prints the graph into the writer, using the traversar
	 * 
	 * @param traversar would traverse the graph
	 * @param action callback which would be called based on traverse 
	 */
	void print(final Traversar<T, R> traversar, final TraversarAction<T, R> action);
}
