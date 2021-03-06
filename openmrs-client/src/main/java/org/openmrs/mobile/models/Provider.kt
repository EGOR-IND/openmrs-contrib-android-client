/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.mobile.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.openmrs.mobile.models.typeConverters.PersonConverter
import org.openmrs.mobile.models.typeConverters.ProviderAttributeConverter
import java.util.*

@Entity(tableName = "provider_table")
class Provider : Resource() {

    @ColumnInfo(name = "id")
    override var id: Long? = null

    @TypeConverters(PersonConverter::class)
    @ColumnInfo(name = "person")
    @SerializedName("person")
    @Expose
    var person: Person? = null

    @ColumnInfo(name = "identifier")
    @SerializedName("identifier")
    @Expose
    var identifier: String? = null

    @TypeConverters(ProviderAttributeConverter::class)
    @ColumnInfo(name = "attributes")
    @SerializedName("attributes")
    @Expose
    var attributes: List<ProviderAttribute> = ArrayList()

    @ColumnInfo(name = "retired")
    @SerializedName("retired")
    @Expose
    var retired: Boolean? = null

    @ColumnInfo(name = "resourceVersion")
    @SerializedName("resourceVersion")
    @Expose
    var resourceVersion: String? = null

}
