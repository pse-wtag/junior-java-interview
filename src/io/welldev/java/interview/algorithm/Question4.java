/**
 *  You are working at a scale SaaS company that maintains deployment versions across
 *  distributed regions.
 *  Due to a global rollout strategy, version IDs are stored in a sorted order:
 *  [1001, 1002, 1003, 1004, 1005, 1006]
 *  However, due to a regional failover+replication lag, the array gets rotated at an unknown point
 *  before being sent to downstream services.
 *  A monitoring service receices the rotated version list:
 *  [1004, 1005, 1006, 1001, 1002, 1003]
 *  Each number represent the release version timestamp (or build ID)
 *  The system needs to find the oldest deployed version (minimum version) quickly.
 **/

void main(){}