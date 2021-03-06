package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbp;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-auth@@18.1.0 */
final class zzaw extends zzes<Void, zza> {
    private final zzbp zza;

    public zzaw(String str, @Nullable String str2) {
        super(7);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zza = new zzbp(str, str2);
    }

    public final String zza() {
        return "applyActionCode";
    }

    public final TaskApiCall<zzdu, Void> zzb() {
        return TaskApiCall.builder().setAutoResolveMissingFeatures(false).setFeatures((this.zzu || this.zzv) ? null : new Feature[]{zze.zza}).run(new zzav(this)).build();
    }

    public final void zze() {
        zzb(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdu zzdu, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzh = new zzez(this, taskCompletionSource);
        if (this.zzu) {
            zzdu.zza().zzj(this.zza.zza(), this.zzc);
        } else {
            zzdu.zza().zza(this.zza, (zzdz) this.zzc);
        }
    }
}
