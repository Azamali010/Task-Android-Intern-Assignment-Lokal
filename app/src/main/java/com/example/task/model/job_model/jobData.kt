package com.example.lokaltask.job_model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Job_table")
data class jobData(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val type: Int,
    val primaryDetails: PrimaryDetails,
    val feeDetails: FeeDetails,
    val jobTags: List<JobTag>,

    val jobType: Int,

    val jobCategoryId: Int,

    val qualification: Int,

    val experience: Int,

    val shiftTiming: Int,

    val jobRoleId: Int,

    val salaryMax: Int,

    val salaryMin: Int,

    val cityLocation: Int,

    val locality: Int,

    val premiumTill: String,

    val content: String,
    val companyName: String,
    val advertiser: Int,
    val buttonText: String,
    val customLink: String,
    val amount: String,
    val views: Int,
    val shares: Int,
    val fbShares: Int,
    val isBookmarked: Boolean,
    val isApplied: Boolean,
    val isOwner: Boolean,
    val updatedOn: String,
    val whatsappNo: String,
    val createdOn: String,
    val isPremium: Boolean,
    val creatives: List<Creative>,
    val videos: List<Any>,

    val locations: List<Location>,

    val tags: List<Any>,
    val contentV3: ContentV3,
    val status: Int,
    val expireOn: String,
    val jobHours: String,
    val openingsCount: Int,
    val jobRole: String,
    val otherDetails: String,
    val jobCategory: String,
    val numApplications: Int,
    val enableLeadCollection: Boolean,
    val isJobSeekerProfileMandatory: Boolean,
    val translatedContent: Map<String, Any>,
    val jobLocationSlug: String,
    val feesText: String,
    val questionBankId: Any?,
    val screeningRetry: Any?,
    val shouldShowLastContacted: Boolean,
    val feesCharged: Int
)
