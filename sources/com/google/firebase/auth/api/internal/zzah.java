package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_auth.zzey;
import com.google.android.gms.internal.firebase_auth.zzfl;
import com.google.firebase.auth.internal.zzy;

/* compiled from: com.google.firebase:firebase-auth@@18.1.0 */
final class zzah implements zzfe<zzey> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzdr zzb;
    private final /* synthetic */ zza zzc;

    zzah(zza zza2, String str, zzdr zzdr) {
        this.zzc = zza2;
        this.zza = str;
        this.zzb = zzdr;
    }

    public final void zza(@Nullable String str) {
        this.zzb.zza(zzy.zza(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzey zzey = (zzey) obj;
        String zzd = zzey.zzd();
        zzfl zzfl = new zzfl();
        zzfl.zzb(zzd).zzd(this.zza);
        this.zzc.zza(this.zzb, zzey, zzfl, (zzfb) this);
    }
}
