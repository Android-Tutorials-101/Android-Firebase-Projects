# Android-Firebase-Projects

<img src='./firebase.png'>


### To get Data from Firebase Database

```
db = FirebaseDatabase.getInstance();

        FirebaseRecyclerOptions<DataModel> options =
                new FirebaseRecyclerOptions.Builder<DataModel>()
                        .setQuery(db.getReference().child("Student"),DataModel.class).
                        build();

```

### Lines to be added 

```
 // Function to tell the app to start getting
    // data from database on starting of the activity
    @Override protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    // Function to tell the app to stop getting
    // data from database on stoping of the activity
    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }

```
