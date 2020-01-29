# Yoga Solo -  Android/iOS Code challenge

Congratulations! You’re nearly there to join our team as Android/iOS developer! 

We have a really big issue in our office and we need you to solve it. We are trying to practice Yoga, but we are not able to remember the different postures, and we need your superpowers as Android/iOS developer to provide us a solution for it! 

We have prepared a JSON file with the postures we need to remember and practice (if you have more postures for us, we would be happy to be able to try them), just you would have to take a look at it, because we left the ***postures.json*** alone in the office and the Marketing team started touching it, so we are not sure that is a completely valid JSON right now or has some incorrect values over there. The ***postures_detail.json*** does not have to be modified.

## What we need? 

Here you have the user stories we would need:

- **[YS-1]** As a user, I should be able to see a list with all the postures that are available
- **[YS-2]** As a user, when I touch a posture, I would be able to access the detail
- **[YS-3]** As a user, I should be able to see on each cell all the information contained, so, if one cell has more lines, the layout should adapt it's size (should support dynamic height)

*Example mock-up for the dynamic height:*

<image src="./images/mockup_list.jpg"></image>

## What you should do?

You should create an Android app in which we would be able to see the postures (retrieved from a server) and the detail of each posture.
To retrieve data from a server, you should create your API with the data we provide you.

Don't worry! This is not a Full Stack code challenge ;-) you can use services like https://github.com/typicode/json-server to get a server up running quickly. From there you can start retrieving the data.

### Bonus Points

- **[YS-4]** As a user, in the posture list, I should be able to search by the name of the posture
- **[YS-5]** As a user, I should be able to reorganize using drag and drop the postures in the list

## General Advice and Tips:

- We like code that is simple, but [simple is different from easy](https://www.infoq.com/presentations/Simple-Made-Easy).
- Keep in mind the [SOLID principles](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)) when doing the project.
- Testing is very important for us. Even if you don't write a single test (for instance, because of time constraints), your app should be easy to test (we love [Dependency injection](https://en.wikipedia.org/wiki/Dependency_injection)).
- Error scenarios should be taken into consideration and it should be easy to add them, even if you don't explicitly handle them.
- Although UI and UX are important, we are more concerned in this demo with your thought process and with how you architect your solution. 
- Your demo should take into consideration features that might be added in the future.
- You can use any 3rd party libraries you wish but be prepared to justify why you did so.
- Be consistent in your code. 
- Be opinionated regarding any architecture you use and take your time to make it a reflection of your thought process.
- A good documentation is always welcome, if there’s something that needs to be documented in order to run the project or whatever that you thing is not clear enough (or something that you would do better in a real project, but for time constraints your doing it in a faster way, just justify it and let us know how it would be the good solution)

## Submitting your solution

- Create a fork of this project
- Do your code
- Commit frequently, we would love to see how you work and how you create your solution
  - Don't be afraid of not perfect code on pushed commits, we would check the final code that appears in the Pull Request
- Remember to use descriptive commit messages
- Use the README.md file to explain what you did
  - Hand in your solution along with any notes, comments, and assumptions you have made while working on the solution

## Data

Here you have some postures in JSON format that you can use for the backend:

***postures.json:***
```json
[
    {
      "id": "5df111bd23f72ffeefe0fa31",
      "name": "Inversion on block".
      "picture": "https://loremflickr.com/320/320/yoga,asana".
      "description": "The posture inversion on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    },
    {
      "id": "5df111bd3b1537fd3ed6a94a",
      "name": "Stretch with strap",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture stretch with strap lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
      "id": "5df111bde6b47a0cdfb264e9",
      "name": "Arm Pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture arm pose lorem ipsum dolor sit amet, consectetur adipiscing elit," sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },,
    {
      "id": "5df111bde57dcfa0bdcdcec1",
      "name": "Sphinx rotation",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture sphinx rotation lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
      "id": "5df111bd3b1537fd3ed6a94a",
      "name": "Inverted pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture inverted pose lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    },
    {
      "id": "5df111bda3f02dd8a3b143c1",
      "name": "Lying down on block",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture lying down on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
    },
    {
      "id": "5df111bd06b2ec5a2e0ba268",
      "name": "Simple twist"
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture simple twist lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    },
    {
      "id": "5df111bd4e67358b133d42fe",
      "name": "Turtle pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture turtle pose lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
      "id": "5df111bd836c69d124cb25e3",
      "name": "Hip Pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture hip pose lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
      "id": "5df111bd3b1537fd3ed6a94a",
      "name": "Rotated wheel pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture rotated wheel pose lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
      "id": "5df111bd2c1f5cbc414ef3d2",
      "name": "Archer",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture archer lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    }
    {
      "id": "5df111bd10ded18b8400e585",
      "name": "Horse pose",
      "picture": "https://loremflickr.com/320/320/yoga,asana",
      "description": "The posture horse pose lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    }
  ]
```

***posture_detail.json:***
```json
[
   {
      "_id":"5df111bd23f72ffeefe0fa31",
      "name":"Inversion on block",
      "teacher":"Hedwig Winter",
      "duration":"23 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":""
   },
   {
      "_id":"5df111bd3b1537fd3ed6a94a",
      "name":"Stretch with strap",
      "teacher":"Lena Pollard",
      "duration":"61 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Ullamco ut voluptate duis tempor aliqua labore nulla anim incididunt fugiat dolor proident occaecat. In adipisicing qui aliquip reprehenderit ut proident et ea officia do magna. Amet enim consequat quis nisi quis aliquip laboris ipsum non quis. Cupidatat ut laboris sunt fugiat sint.\r\nDuis ut veniam aute elit irure consequat labore duis pariatur tempor amet quis velit. Irure elit cupidatat esse eiusmod cillum excepteur mollit. Deserunt tempor consequat enim enim tempor commodo veniam deserunt quis aliquip quis incididunt reprehenderit. Officia laboris occaecat nisi non non deserunt excepteur. Commodo veniam elit anim sunt minim pariatur ea ad.\r\nDeserunt laborum sit voluptate incididunt sit magna nisi mollit commodo do veniam. Duis dolore irure irure ad duis veniam elit voluptate ipsum sint nulla excepteur cillum. Dolor et incididunt ea voluptate reprehenderit quis ipsum sint ullamco amet excepteur."
   },
   {
      "_id":"5df111bde6b47a0cdfb264e9",
      "name":"Arm Pose",
      "teacher":"Sarumann Richardson",
      "duration":"62 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Fugiat aliqua aute veniam veniam consequat culpa deserunt excepteur. Commodo amet mollit consequat nisi exercitation. Mollit occaecat minim cupidatat occaecat ullamco excepteur pariatur nulla. Consectetur aliquip ipsum voluptate Lorem anim. Eiusmod et laboris anim pariatur voluptate officia. Proident ea veniam non magna veniam ipsum nulla.\r\nConsectetur adipisicing elit mollit et cillum qui velit dolore enim. Pariatur magna ad minim et. Sit ad eiusmod duis labore in culpa cupidatat ipsum aliqua nisi duis.\r\nCillum consequat ipsum reprehenderit ipsum cupidatat amet nostrud. Ad anim Lorem nulla nulla est. Ullamco in ipsum exercitation voluptate non sit anim id sit cillum nisi veniam. Commodo reprehenderit nisi commodo sint culpa in in ullamco fugiat aliqua qui.\r\nIn qui commodo consequat ad est amet anim proident Lorem. Proident magna commodo sunt do officia velit nisi tempor ullamco sunt consequat. Aliqua est proident non dolore nulla cupidatat consequat voluptate aute aliqua sint. Lorem in do aliqua non incididunt adipisicing tempor ad aliquip id."
   },
   {
      "_id":"5df111bde57dcfa0bdcdcec1",
      "name":"Sphinx rotation",
      "teacher":"Luk Skywallker",
      "duration":"32 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Non in elit excepteur sint consectetur nulla fugiat ut velit quis ex excepteur consequat ullamco. Occaecat aliqua enim ut labore ad commodo minim consequat eu in. Aliquip excepteur officia culpa cillum dolor ea sunt irure. Nostrud laborum anim et nostrud anim enim sint qui et. Adipisicing aute excepteur cupidatat quis nostrud. Sit minim dolor sunt aliquip fugiat consequat incididunt ipsum. Occaecat amet mollit sit minim aliqua duis consequat deserunt ea occaecat.\r\nDolore adipisicing officia proident aliqua. Mollit labore irure reprehenderit aliqua. Labore laboris officia est cupidatat. Nisi deserunt adipisicing aute ea officia amet eiusmod et in labore ut ipsum excepteur. Commodo amet laborum consequat amet nulla sunt qui.\r\nExercitation laboris sit duis dolor exercitation tempor ad excepteur ex eu voluptate. Laborum ex enim amet incididunt do mollit aliquip ad minim nulla voluptate veniam consequat. Do quis nulla magna culpa cupidatat eiusmod et in. Duis eu elit eiusmod mollit culpa. Irure mollit ut quis proident qui. Eu veniam reprehenderit commodo quis nisi.\r\nSint sint incididunt Lorem commodo esse ullamco est. Occaecat sint sunt nulla cillum labore excepteur adipisicing fugiat ut aliquip proident deserunt ea duis. Cillum nulla duis enim labore incididunt in exercitation velit Lorem quis ex. Qui dolore officia deserunt quis enim anim minim id exercitation elit. Excepteur ullamco cupidatat elit anim consectetur nisi qui irure."
   },
   {
      "_id":"5df111bdbbaf1a0d62492bbe",
      "name":"Inverted pose",
      "teacher":"Dustin Henderon",
      "duration":"27 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Excepteur ut irure dolor magna. Magna labore sint ad occaecat culpa. Voluptate proident qui est reprehenderit ullamco ullamco. Sunt non nisi ea Lorem enim veniam qui laboris sint incididunt exercitation labore aliquip. Cillum exercitation mollit adipisicing ut ea fugiat minim excepteur anim. Aute cupidatat anim pariatur in et laboris minim cillum.\r\nId non adipisicing incididunt occaecat qui est laborum magna reprehenderit ipsum id laboris enim fugiat. Dolore proident quis Lorem tempor magna cupidatat. Veniam aliqua veniam aute quis do consequat exercitation nisi Lorem nisi dolor. Excepteur magna non Lorem quis aute. Minim deserunt aliqua cillum nisi minim laboris labore aute magna dolor Lorem non laboris do. Qui proident qui laborum duis. Eiusmod voluptate consequat qui adipisicing id proident deserunt.\r\nEnim veniam Lorem elit excepteur non est tempor nostrud. Deserunt ipsum irure voluptate consectetur ad in officia minim sit reprehenderit laborum. Id cupidatat labore Lorem eiusmod sunt dolor aute.\r\nQuis proident enim aliquip duis dolore veniam aliqua quis incididunt in ullamco laboris. Cupidatat consectetur aliqua proident cupidatat deserunt enim consequat sunt Lorem ex officia irure amet. Amet anim est in reprehenderit aute sint deserunt elit dolor ullamco. Labore esse minim dolor quis eu occaecat aliqua reprehenderit."
   },
   {
      "_id":"5df111bda3f02dd8a3b143c1",
      "name":"Lying down on block",
      "teacher":"Tammi Hudson",
      "duration":"27 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Id eu deserunt eiusmod et irure quis commodo ipsum commodo dolore labore velit. Deserunt ad eiusmod adipisicing dolore aute reprehenderit esse aliquip. Ullamco nostrud consectetur esse ipsum cupidatat consectetur duis. Sint occaecat minim ut reprehenderit officia. Magna laborum exercitation in est voluptate sit.\r\nExcepteur nulla sunt enim cillum amet do ex. Deserunt officia sit est irure. Reprehenderit est occaecat aute mollit labore reprehenderit nulla ipsum veniam elit. Qui est consectetur reprehenderit adipisicing adipisicing nisi.\r\nSint reprehenderit duis occaecat sit. Incididunt nisi in irure aliqua dolore eu. Enim Lorem aliqua sit veniam ut aliqua incididunt deserunt ipsum culpa cillum culpa. Voluptate amet velit Lorem reprehenderit minim est laborum ullamco enim dolor. Velit magna ex laborum elit sit sunt dolore irure laboris aute.\r\nId consectetur irure ex ex fugiat mollit proident. Duis cillum anim officia ut non officia exercitation laboris tempor adipisicing sit qui dolore labore. Tempor cillum adipisicing excepteur culpa dolore laboris aute proident proident tempor minim qui sunt velit.\r\nNon aute labore irure nulla nulla dolor sunt non laboris. Mollit non anim sit ipsum anim do cupidatat consectetur excepteur dolor commodo."
   },
   {
      "_id":"5df111bd06b2ec5a2e0ba268",
      "name":"Simple twist",
      "teacher":"Harry Poterr",
      "duration":"56 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Minim labore sint elit esse amet esse officia est sit aliquip. Occaecat consectetur elit ea aliqua elit. Aliqua aliqua nisi do magna sint exercitation cupidatat aliquip eu est dolore. Officia aliquip ex incididunt incididunt fugiat id dolor est est fugiat. Cupidatat qui ad occaecat ut mollit anim ea voluptate anim incididunt exercitation elit incididunt. Cillum ea irure do veniam labore sunt ullamco ipsum nisi exercitation esse deserunt veniam est. Cillum officia irure exercitation ea Lorem aliquip voluptate dolor velit ea culpa.\r\nFugiat consectetur voluptate occaecat nisi anim proident ad voluptate elit aute. Nostrud occaecat nisi magna ad reprehenderit Lorem do qui. Et ea irure aliquip quis aliquip in sunt consectetur aliqua.\r\nAdipisicing minim excepteur eiusmod anim tempor anim do anim sit sint eiusmod qui mollit aliqua. Et ad non voluptate ea do ut mollit ex ut nostrud duis ipsum. Dolore laborum mollit quis amet commodo. Id ad sint reprehenderit cupidatat sint in exercitation aliquip tempor exercitation. Proident mollit nisi id non deserunt. Irure nisi elit irure est quis aliquip esse esse.\r\nUt labore est nulla nostrud esse ad in exercitation est. Laborum irure eiusmod do in occaecat cupidatat. Qui commodo nostrud Lorem quis consectetur Lorem et dolore. In in mollit duis irure dolore tempor voluptate ea. Deserunt anim deserunt tempor adipisicing ut aute aute in sit qui. Cupidatat eiusmod eu ut laborum duis exercitation consequat consectetur.\r\nDolor commodo veniam veniam culpa incididunt. Sunt ullamco id in culpa minim nostrud mollit amet id tempor sit duis. Eiusmod velit eiusmod labore fugiat culpa et mollit minim tempor.\r\nUt esse laboris veniam cupidatat reprehenderit. Voluptate tempor ipsum duis minim laboris. Adipisicing nulla velit laborum duis sit aliquip dolor nisi exercitation excepteur nisi pariatur in. Duis reprehenderit commodo ullamco esse consequat sunt ullamco dolor ex est anim. Nulla deserunt pariatur exercitation ut sunt officia sint magna. Ex aute cupidatat eiusmod officia. Sit ut ad proident deserunt anim dolore consequat.\r\nExcepteur tempor ea non labore voluptate adipisicing voluptate non non fugiat incididunt cupidatat deserunt incididunt. Ut reprehenderit officia culpa eu pariatur id mollit proident cillum anim. Sit et esse exercitation non ex nostrud commodo occaecat."
   },
   {
      "_id":"5df111bd4e67358b133d42fe",
      "name":"Turtle pose",
      "teacher":"Mutten Roshii",
      "duration":"65 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Ut veniam enim ut ipsum anim nulla reprehenderit reprehenderit et ipsum anim veniam. Non exercitation fugiat sint adipisicing. Laboris sunt nulla ipsum non reprehenderit consequat ad. Quis enim veniam irure esse ut exercitation enim minim consequat ut consequat elit consectetur.\r\nUt sunt reprehenderit velit esse duis. Sint cupidatat non qui ullamco quis cillum quis laborum eu eu est consectetur ut. Deserunt commodo tempor nulla aliquip velit cupidatat esse nulla veniam cillum dolor dolore aute. Ad consectetur reprehenderit ullamco velit eu amet eiusmod ullamco amet ullamco. Enim nulla in ipsum ipsum commodo laboris.\r\nQuis nostrud exercitation cupidatat incididunt cillum. Proident nulla do consectetur consectetur do dolor minim ut tempor commodo proident ut. Aliquip tempor nulla sunt excepteur anim sunt duis. Veniam ex magna nulla nisi dolor ut veniam culpa pariatur reprehenderit do. Mollit dolore consectetur in incididunt voluptate amet nostrud sunt ad.\r\nProident fugiat Lorem quis reprehenderit id ut nulla aute deserunt tempor ea do nostrud. Eiusmod proident Lorem enim est incididunt Lorem reprehenderit dolor deserunt mollit pariatur irure. Consequat ex consequat incididunt ex aliquip cupidatat Lorem tempor dolore minim officia aliqua.\r\nOfficia voluptate cupidatat fugiat tempor cupidatat cillum velit incididunt adipisicing. In do consequat consectetur sit minim exercitation. Adipisicing est eu aliqua magna. Consectetur laboris ex incididunt dolor enim amet ipsum fugiat ex sit. Pariatur labore aute sunt qui magna laborum et ad ea tempor nisi. Proident mollit qui eiusmod laboris irure incididunt exercitation dolor laborum proident laborum.\r\nConsectetur exercitation qui deserunt nostrud exercitation nostrud labore dolore magna adipisicing dolore incididunt labore. Minim do velit enim cillum consectetur commodo enim consectetur. Lorem occaecat voluptate velit aliquip. Cupidatat voluptate do proident minim excepteur irure quis. Mollit do dolor Lorem adipisicing velit velit mollit labore id.\r\nAdipisicing dolor sunt et nulla nostrud anim laboris. Mollit deserunt incididunt irure aute pariatur exercitation. Anim sint aliqua non adipisicing aliquip ullamco occaecat. Commodo est qui aliquip ut.\r\nExercitation esse reprehenderit id enim eu labore sint. Quis deserunt amet do cupidatat sunt ullamco. Dolore id excepteur exercitation labore cillum velit minim officia ipsum non ea excepteur. Officia est ea labore fugiat dolore nisi fugiat eiusmod do ut laboris."
   },
   {
      "_id":"5df111bd836c69d124cb25e3",
      "name":"Hip Pose",
      "teacher":"Helene Rutledge",
      "duration":"65 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Ut veniam enim ut ipsum anim nulla reprehenderit reprehenderit et ipsum anim veniam. Non exercitation fugiat sint adipisicing. Laboris sunt nulla ipsum non reprehenderit consequat ad. Quis enim veniam irure esse ut exercitation enim minim consequat ut consequat elit consectetur.\r\nUt sunt reprehenderit velit esse duis. Sint cupidatat non qui ullamco quis cillum quis laborum eu eu est consectetur ut. Deserunt commodo tempor nulla aliquip velit cupidatat esse nulla veniam cillum dolor dolore aute. Ad consectetur reprehenderit ullamco velit eu amet eiusmod ullamco amet ullamco. Enim nulla in ipsum ipsum commodo laboris.\r\nQuis nostrud exercitation cupidatat incididunt cillum. Proident nulla do consectetur consectetur do dolor minim ut tempor commodo proident ut. Aliquip tempor nulla sunt excepteur anim sunt duis. Veniam ex magna nulla nisi dolor ut veniam culpa pariatur reprehenderit do. Mollit dolore consectetur in incididunt voluptate amet nostrud sunt ad.\r\nProident fugiat Lorem quis reprehenderit id ut nulla aute deserunt tempor ea do nostrud. Eiusmod proident Lorem enim est incididunt Lorem reprehenderit dolor deserunt mollit pariatur irure. Consequat ex consequat incididunt ex aliquip cupidatat Lorem tempor dolore minim officia aliqua."
   },
   {
      "_id":"5df111bd95e020c3a7019779",
      "name":"Rotated wheel pose",
      "teacher":"Dante Matty",
      "duration":"65 min",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Ut veniam enim ut ipsum anim nulla reprehenderit reprehenderit et ipsum anim veniam. Non exercitation fugiat sint adipisicing. Laboris sunt nulla ipsum non reprehenderit consequat ad. Quis enim veniam irure esse ut exercitation enim minim consequat ut consequat elit consectetur.\r\nUt sunt reprehenderit velit esse duis. Sint cupidatat non qui ullamco quis cillum quis laborum eu eu est consectetur ut. Deserunt commodo tempor nulla aliquip velit cupidatat esse nulla veniam cillum dolor dolore aute. Ad consectetur reprehenderit ullamco velit eu amet eiusmod ullamco amet ullamco. Enim nulla in ipsum ipsum commodo laboris.\r\nQuis nostrud exercitation cupidatat incididunt cillum. Proident nulla do consectetur consectetur do dolor minim ut tempor commodo proident ut. Aliquip tempor nulla sunt excepteur anim sunt duis. Veniam ex magna nulla nisi dolor ut veniam culpa pariatur reprehenderit do. Mollit dolore consectetur in incididunt voluptate amet nostrud sunt ad.\r\nProident fugiat Lorem quis reprehenderit id ut nulla aute deserunt tempor ea do nostrud. Eiusmod proident Lorem enim est incididunt Lorem reprehenderit dolor deserunt mollit pariatur irure. Consequat ex consequat incididunt ex aliquip cupidatat Lorem tempor dolore minim officia aliqua.\r\nOfficia voluptate cupidatat fugiat tempor cupidatat cillum velit incididunt adipisicing. In do consequat consectetur sit minim exercitation. Adipisicing est eu aliqua magna. Consectetur laboris ex incididunt dolor enim amet ipsum fugiat ex sit. Pariatur labore aute sunt qui magna laborum et ad ea tempor nisi. Proident mollit qui eiusmod laboris irure incididunt exercitation dolor laborum proident laborum.\r\nConsectetur exercitation qui deserunt nostrud exercitation nostrud labore dolore magna adipisicing dolore incididunt labore. Minim do velit enim cillum consectetur commodo enim consectetur. Lorem occaecat voluptate velit aliquip. Cupidatat voluptate do proident minim excepteur irure quis. Mollit do dolor Lorem adipisicing velit velit mollit labore id.\r\nAdipisicing dolor sunt et nulla nostrud anim laboris. Mollit deserunt incididunt irure aute pariatur exercitation. Anim sint aliqua non adipisicing aliquip ullamco occaecat. Commodo est qui aliquip ut.\r\nExercitation esse reprehenderit id enim eu labore sint. Quis deserunt amet do cupidatat sunt ullamco. Dolore id excepteur exercitation labore cillum velit minim officia ipsum non ea excepteur. Officia est ea labore fugiat dolore nisi fugiat eiusmod do ut laboris.\r\n"
   },
   {
      "_id":"5df111bd2c1f5cbc414ef3d2",
      "name":"Archer",
      "teacher":"Lego Las",
      "duration":"-9",
      "picture":"https://loremflickr.com/600/600/yoga,asana",
      "description":"Ut veniam enim ut ipsum anim nulla reprehenderit reprehenderit et ipsum anim veniam. Non exercitation fugiat sint adipisicing."
   },
   {
      "_id":"5df111bd10ded18b8400e585",
      "name":"Horse pose",
      "teacher":"Gan Dalff",
      "duration":"65 min",
      "picture":"iamnotavalidURL/600/600/yoga,asana",
      "description":"Ut veniam enim ut ipsum anim nulla reprehenderit reprehenderit et ipsum anim veniam. Non exercitation fugiat sint adipisicing. Laboris sunt nulla ipsum non reprehenderit consequat ad. Quis enim veniam irure esse ut exercitation enim minim consequat ut consequat elit consectetur.\r\nUt sunt reprehenderit velit esse duis. Sint cupidatat non qui ullamco quis cillum quis laborum eu eu est consectetur ut. Deserunt commodo tempor nulla aliquip velit cupidatat esse nulla veniam cillum dolor dolore aute. Ad consectetur reprehenderit ullamco velit eu amet eiusmod ullamco amet ullamco. Enim nulla in ipsum ipsum commodo laboris."
   }
]
```

## Thanks

The structure of this README has been inspired by:
https://github.com/luvotels/fs-hiring-test



