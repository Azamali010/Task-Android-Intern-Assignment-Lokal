# Overview
# This Android application is built using Jetpack Compose and demonstrates modern Android development practices. The app consists of two main sections: "Jobs" and "Bookmarks", accessible via a bottom navigation UI.

# Features
Jobs Screen: Fetches job listings from an API using a paginated approach. Each job card displays the job title, location, salary, and contact phone number.
Job Details: Clicking on a job card opens a detailed view with more information about the selected job.
Bookmarks: Users can bookmark jobs, which are then stored locally in a database for offline access. Bookmarked jobs are accessible through the "Bookmarks" tab.
State Management: The app handles various states including loading, error, and empty states to ensure a smooth user experience.
Offline Support: Bookmarked jobs are stored in a local database, allowing users to view them even when offline.
# Technology Stack
Jetpack Compose: For modern, declarative UI development.
Retrofit: For API calls and network management.
Room Database: For local data storage to support offline mode.
Paging 3: To efficiently load paginated data from the API.
Coroutines & Flow: For managing asynchronous tasks and data streams.
Material 3 Components: For UI elements to ensure a consistent and modern look and feel.
