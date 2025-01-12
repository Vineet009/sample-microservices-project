project_id       = "${env.GCP_PROJECT}"
credentials_file = "${env.GCP_SA_KEY}"
region           = "${env.GCP_REGION}"
cluster_name     = "${env.GKE_CLUSTER}"
node_count       = 1
machine_type     = "e2-medium"