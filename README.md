# Manual deploy

## Create the namespace

First login into openshift:

```
oc login -u <YOUR_USER>
```

On minishift (you can use whatever you want as password):

```
oc login -u developer
```

Then create our prject:

```
oc new-project hello-rest
```

## build the app locally

```
cd spring-boot-rest-service
```

```
 mvn clean package spring-boot:repackage
```

## Create the binary builder

We can create the builder for our application:

```
oc new-app redhat-openjdk18-openshift:1.8 --binary --name=hello-rest
```

```
oc start-build hello-rest --from-file spring-boot-rest-service/target/hello-rest-1.0.jar
```

## Expose the service as route.

```
oc expose svc hello-rest
```