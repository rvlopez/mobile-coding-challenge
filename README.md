# Yoga Solo -  Android Code challenge

This is my solution for the Yoga Solo Challenge. The following is a brief description of the technical decisions taken for the development.

## API Service Highlights

I've changed the JSON server because the suggested was not working. Despite their simple configuration, the endpoints returned error 304. I tried more than three different JSON server and none of them worked well. Finally, I found [Mocky.io](https://www.mocky.io/) and I decided to use it.

Mocky has a big problem for this challenge because doesn't allow query filtering to request a single posture detail from the JSON webservice.

In order not to waste much more time on the backend, I solved this problem in the `RemoteDataSource`, filtering the whole JSON file by id isolating this problem from the other layers.

Another problem is that Mocky generated endpoints are random strings, so we have a poor verbose endpoints. As I said, I'm using this as a webservice in order not to waste much more time on the backend.

## Architecture

* Application written in Kotlin based on Clean Architecture for layer abstractions (view/domain/data) and splitted by modules.
* MVVM for the presentation layer.
* Interactors / UseCases are used by the presenters to start a data retrieval flow.
* UseCases use Repository pattern to request the data needed.
* Repository have DataSources in order to let the possibility to adddatabase/cache/other sources to retrieve data in the future.
* Three different data objects, DTO (Data transfer object) to parse API's response, Business Object as our own data model and UI data model to populate the views.
* DI with Dagger2.
* Asynchronous handled by RxJava2 (RxKotlin).
* Image loading handled by Gradle. 

## Thirtd-Party

* RxKotlin https://github.com/ReactiveX/RxKotlin
* Dagger 2 https://google.github.io/dagger/
* Retrofit 2 https://square.github.io/retrofit/
* OkHttp 3 https://github.com/square/okhttp
* Glide https://github.com/bumptech/glide
* Lottie https://airbnb.design/lottie/

## Work in progress

* Instrumentation Testing
* Cache / database
* [YS-4] As a user, in the posture list, I should be able to search by the name of the posture
* [YS-5] As a user, I should be able to reorganize using drag and drop the postures in the list


