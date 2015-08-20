package org.manticore.cq.queryhandler;

import org.mantirecore.cq.query.Query;
import org.mantirecore.cq.query.QueryResult;

public interface QueryHandler {
	public QueryResult execute(Query q);
}
