# PARCS-JAVA

Consists of hosts-server (load balancer) and a bunch of daemons (slaves). One can submit task to hosts-server via sending corresponding `.jar` file.

## Creating GCE instances

First of all let's set default project in `gcloud` tool by running `gcloud config set project "moggio-165703"`.

We'll create 2 instances for daemons, one for hosts-server and one to for an application.
```
$ gcloud compute instances create hosts-server daemon-1 daemon-2 app --zone us-central1-c

Created [https://www.googleapis.com/compute/v1/projects/moggio-165703/zones/us-central1-c/instances/hosts-server].
Created [https://www.googleapis.com/compute/v1/projects/moggio-165703/zones/us-central1-c/instances/daemon-1].
Created [https://www.googleapis.com/compute/v1/projects/moggio-165703/zones/us-central1-c/instances/daemon-2].
Created [https://www.googleapis.com/compute/v1/projects/moggio-165703/zones/us-central1-c/instances/app].
NAME          ZONE           MACHINE_TYPE   PREEMPTIBLE  INTERNAL_IP  EXTERNAL_IP    STATUS
hosts-server  us-central1-c  n1-standard-1               10.128.0.2   35.192.221.94  RUNNING
daemon-1      us-central1-c  n1-standard-1               10.128.0.5   35.188.57.169  RUNNING
daemon-2      us-central1-c  n1-standard-1               10.128.0.4   35.192.8.28    RUNNING
app           us-central1-c  n1-standard-1               10.128.0.3   35.192.150.94  RUNNING
```

## Setting up daemons

Let's start with `daemon-1` and connect to it via `gcloud compute ssh daemon-1 --zone us-central1-c`.
Now we need to install `java` like this `sudo apt-get update && sudo apt-get install -y openjdk-9-jdk`.
After this we need to download pre-packed daemon `wget https://github.com/lionell/labs/raw/master/parcs/Daemon/Daemon.jar`.
Finally we can run our daemon `java -jar Daemon.jar&`.

To recap, here all the steps together
```
$ sudo apt-get update
$ sudo apt-get install -y openjdk-9-jdk
$ wget https://github.com/lionell/labs/raw/master/parcs/Daemon/Daemon.jar
$ java -jar Daemon.jar&
```

## Cleaning up

Don't forget to remove all created instances as resources are not free. If you don't do it GCP can **charge you**!
```
$ gcloud compute instances delete daemon-1 daemon-2 hosts-server app --zone us-central1-c
```